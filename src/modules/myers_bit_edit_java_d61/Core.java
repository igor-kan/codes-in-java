package com.igorkan.modules.myers_bit_edit_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int distance(String pattern, String text) {
        byte[] p = pattern.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        byte[] t = text.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int m = p.length;
        if (m == 0) {
            return t.length;
        }
        if (m > 64) {
            return classic(p, t);
        }
        long[] peq = new long[256];
        for (int i = 0; i < m; ++i) {
            peq[p[i] & 0xff] |= 1L << i;
        }
        long pv = ~0L;
        long mv = 0L;
        int score = m;
        long last = 1L << (m - 1);
        for (byte b : t) {
            long eq = peq[b & 0xff];
            long xv = eq | mv;
            long xh = (((eq & pv) + pv) ^ pv) | eq;
            long ph = mv | ~(xh | pv);
            long mh = pv & xh;
            if ((ph & last) != 0L) {
                ++score;
            }
            if ((mh & last) != 0L) {
                --score;
            }
            ph = (ph << 1) | 1L;
            mh <<= 1;
            pv = mh | ~(xv | ph);
            mv = ph & xv;
        }
        return score;
    }

    private static int classic(byte[] a, byte[] b) {
        int[] prev = new int[b.length + 1];
        int[] cur = new int[b.length + 1];
        for (int j = 0; j <= b.length; ++j) {
            prev[j] = j;
        }
        for (int i = 1; i <= a.length; ++i) {
            cur[0] = i;
            for (int j = 1; j <= b.length; ++j) {
                int cost = a[i - 1] == b[j - 1] ? 0 : 1;
                cur[j] = Math.min(prev[j] + 1, Math.min(cur[j - 1] + 1, prev[j - 1] + cost));
            }
            int[] tmp = prev;
            prev = cur;
            cur = tmp;
        }
        return prev[b.length];
    }
}
