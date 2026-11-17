package com.igorkan.modules.suffix_array_kasai_java;

import java.util.Arrays;

public final class Core implements Contract {
    @Override
    public Types.SuffixIndex build(String text) {
        Validation.requireNonEmpty(text);
        int n = text.length();
        Integer[] order = new Integer[n];
        int[] rk = new int[n];
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = i;
            rk[i] = text.charAt(i);
        }
        for (int step = 1; step < n; step <<= 1) {
            final int k = step;
            final int[] curRk = rk;
            Arrays.sort(order, (a, b) -> {
                if (curRk[a] != curRk[b]) return Integer.compare(curRk[a], curRk[b]);
                int ra = (a + k < n) ? curRk[a + k] : -1;
                int rb = (b + k < n) ? curRk[b + k] : -1;
                return Integer.compare(ra, rb);
            });
            tmp[order[0]] = 0;
            for (int i = 1; i < n; i++) {
                int a = order[i - 1], b = order[i];
                boolean diff = rk[a] != rk[b] || ((a + k < n ? rk[a + k] : -1) != (b + k < n ? rk[b + k] : -1));
                tmp[b] = tmp[a] + (diff ? 1 : 0);
            }
            System.arraycopy(tmp, 0, rk, 0, n);
            if (rk[order[n - 1]] == n - 1) break;
        }
        int[] sa = new int[n];
        int[] inv = new int[n];
        for (int i = 0; i < n; i++) {
            sa[i] = order[i];
            inv[sa[i]] = i;
        }
        int[] lcp = new int[n];
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (inv[i] > 0) {
                int j = sa[inv[i] - 1];
                while (i + h < n && j + h < n && text.charAt(i + h) == text.charAt(j + h)) h++;
                lcp[inv[i]] = h;
                if (h > 0) h--;
            }
        }
        return new Types.SuffixIndex(text, sa, lcp);
    }
}
