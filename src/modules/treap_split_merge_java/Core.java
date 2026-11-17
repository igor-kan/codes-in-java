package com.igorkan.modules.treap_split_merge_java;

public final class Core implements Contract {
    private Types.Node root;
    private long rng = 0x9E3779B97F4A7C15L;

    private long nextPriority() {
        rng += 0x9E3779B97F4A7C15L;
        long z = rng;
        z = (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L;
        z = (z ^ (z >>> 27)) * 0x94D049BB133111EBL;
        return z ^ (z >>> 31);
    }

    private static int sz(Types.Node n) { return n == null ? 0 : n.size; }
    private static void pull(Types.Node n) { if (n != null) n.size = 1 + sz(n.left) + sz(n.right); }

    private static Types.Node[] split(Types.Node n, int key) {
        if (n == null) return new Types.Node[]{null, null};
        if (n.key <= key) {
            Types.Node[] p = split(n.right, key);
            n.right = p[0];
            pull(n);
            return new Types.Node[]{n, p[1]};
        } else {
            Types.Node[] p = split(n.left, key);
            n.left = p[1];
            pull(n);
            return new Types.Node[]{p[0], n};
        }
    }

    private static Types.Node merge(Types.Node a, Types.Node b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.priority > b.priority) {
            a.right = merge(a.right, b);
            pull(a);
            return a;
        } else {
            b.left = merge(a, b.left);
            pull(b);
            return b;
        }
    }

    public boolean contains(int key) {
        Types.Node cur = root;
        while (cur != null) {
            if (key == cur.key) return true;
            cur = key < cur.key ? cur.left : cur.right;
        }
        return false;
    }

    @Override
    public boolean insert(int key) {
        if (contains(key)) return false;
        Types.Node[] p = split(root, key);
        root = merge(merge(p[0], new Types.Node(key, nextPriority())), p[1]);
        return true;
    }

    @Override
    public boolean erase(int key) {
        if (!contains(key)) return false;
        Types.Node[] p1 = split(root, key - 1);
        Types.Node[] p2 = split(p1[1], key);
        root = merge(p1[0], p2[1]);
        return true;
    }

    @Override
    public int kthSmallest(int k) {
        Validation.requireRank(sz(root), k);
        Types.Node cur = root;
        while (cur != null) {
            int lsz = sz(cur.left);
            if (k < lsz) cur = cur.left;
            else if (k == lsz) return cur.key;
            else { k -= lsz + 1; cur = cur.right; }
        }
        throw new IllegalStateException("unreachable");
    }

    public Types.Node rootNode() { return root; }
    public int size() { return sz(root); }
}
