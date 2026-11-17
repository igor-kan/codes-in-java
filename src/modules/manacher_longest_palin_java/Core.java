package com.igorkan.modules.manacher_longest_palin_java;

public final class Core implements Contract {
    @Override
    public Types.PalinResult analyze(String s) {
        Validation.requireNonEmpty(s);
        int n = s.length();
        char[] t = new char[2 * n + 3];
        t[0] = '^';
        for (int i = 0; i < n; i++) {
            t[2 * i + 1] = '#';
            t[2 * i + 2] = s.charAt(i);
        }
        t[2 * n + 1] = '#';
        t[2 * n + 2] = '$';
        int m = t.length;
        int[] p = new int[m];
        int center = 0, right = 0;
        int bestLen = 0, bestCenter = 0;
        long count = 0;
        for (int i = 1; i < m - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right) p[i] = Math.min(right - i, p[mirror]);
            while (t[i + 1 + p[i]] == t[i - 1 - p[i]]) p[i]++;
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
            if (p[i] > bestLen) {
                bestLen = p[i];
                bestCenter = i;
            }
            count += (p[i] + 1) / 2;
        }
        int start = (bestCenter - bestLen) / 2;
        return new Types.PalinResult(s.substring(start, start + bestLen), start, bestLen, count);
    }
}
