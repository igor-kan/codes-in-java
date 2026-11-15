package com.igorkan.modules.huffman_canonical_codec;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public final class Core implements Contract {
    private static final class TreeNode {
        int sym;
        final long freq;
        TreeNode left;
        TreeNode right;
        TreeNode(int sym, long freq, TreeNode l, TreeNode r) {
            this.sym = sym; this.freq = freq; this.left = l; this.right = r;
        }
    }

    public final Types.CodeEntry[] table = new Types.CodeEntry[256];
    private final TreeNode decodeRoot;

    public Core(byte[] sample) {
        long[] freq = new long[256];
        for (byte b : sample) freq[b & 0xff]++;
        PriorityQueue<TreeNode> pq = new PriorityQueue<>(Comparator.comparingLong(n -> n.freq));
        for (int s = 0; s < 256; s++) {
            if (freq[s] > 0) pq.add(new TreeNode(s, freq[s], null, null));
        }
        if (pq.size() == 1) {
            TreeNode only = pq.poll();
            table[only.sym] = new Types.CodeEntry(only.sym, 1, 0);
            TreeNode root = new TreeNode(-1, only.freq, null, null);
            root.left = new TreeNode(only.sym, only.freq, null, null);
            this.decodeRoot = root;
            return;
        }
        while (pq.size() > 1) {
            TreeNode a = pq.poll(), b = pq.poll();
            pq.add(new TreeNode(-1, a.freq + b.freq, a, b));
        }
        int[] lens = new int[256];
        collectLens(pq.poll(), 0, lens);
        List<int[]> active = new ArrayList<>();
        for (int s = 0; s < 256; s++) if (lens[s] > 0) active.add(new int[]{lens[s], s});
        active.sort((x, y) -> x[0] != y[0] ? Integer.compare(x[0], y[0]) : Integer.compare(x[1], y[1]));

        int code = 0, prevLen = 0;
        for (int[] entry : active) {
            int len = entry[0], sym = entry[1];
            code <<= (len - prevLen);
            table[sym] = new Types.CodeEntry(sym, len, code);
            code++;
            prevLen = len;
        }
        this.decodeRoot = buildDecodeTrie(active);
    }

    private static TreeNode buildDecodeTrie(List<int[]> active) {
        int code = 0, prevLen = 0;
        TreeNode root = new TreeNode(-1, 0, null, null);
        for (int[] e : active) {
            int len = e[0], sym = e[1];
            code <<= (len - prevLen);
            insertTrie(root, code, len, sym);
            code++;
            prevLen = len;
        }
        return root;
    }

    private static void insertTrie(TreeNode root, int code, int len, int sym) {
        TreeNode cur = root;
        for (int k = len - 1; k >= 0; k--) {
            int bit = (code >>> k) & 1;
            if (bit == 0) {
                if (cur.left == null) cur.left = new TreeNode(-1, 0, null, null);
                cur = cur.left;
            } else {
                if (cur.right == null) cur.right = new TreeNode(-1, 0, null, null);
                cur = cur.right;
            }
        }
        cur.sym = sym;
    }

    private static void collectLens(TreeNode n, int d, int[] lens) {
        if (n.sym >= 0) { lens[n.sym] = Math.max(1, d); return; }
        collectLens(n.left, d + 1, lens);
        collectLens(n.right, d + 1, lens);
    }

    @Override
    public Types.EncodedPayload encode(byte[] data) {
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        int curByte = 0, bitPos = 0, totalBits = 0;
        for (byte b : data) {
            Types.CodeEntry e = table[b & 0xff];
            Errors.require(e != null, "unknown symbol during encode");
            for (int k = e.bitLen() - 1; k >= 0; k--) {
                int bit = (e.codeBits() >>> k) & 1;
                curByte = (curByte << 1) | bit;
                bitPos++;
                totalBits++;
                if (bitPos == 8) { baos.write(curByte); curByte = 0; bitPos = 0; }
            }
        }
        if (bitPos > 0) baos.write(curByte << (8 - bitPos));
        return new Types.EncodedPayload(baos.toByteArray(), totalBits);
    }

    @Override
    public byte[] decode(Types.EncodedPayload payload) {
        Errors.require(decodeRoot != null, "empty decoder");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        TreeNode cur = decodeRoot;
        for (int i = 0; i < payload.bitCount(); i++) {
            int bit = (payload.bits()[i / 8] >>> (7 - (i % 8))) & 1;
            cur = (bit == 0) ? cur.left : cur.right;
            Errors.require(cur != null, "invalid prefix bitstream");
            if (cur.sym >= 0) {
                out.write(cur.sym);
                cur = decodeRoot;
            }
        }
        Errors.require(cur == decodeRoot, "dangling partial huffman bits");
        return out.toByteArray();
    }
}
