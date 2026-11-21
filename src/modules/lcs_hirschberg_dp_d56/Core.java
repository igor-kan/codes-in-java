package com.igorkan.modules.lcs_hirschberg_dp_d56;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int lcsLength(int[] a, int[] b) {
        if (a.length < b.length) { int[] t = a; a = b; b = t; }
        int m = a.length, n = b.length;
        int[] prev = new int[n + 1];
        int[] cur = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i - 1] == b[j - 1]) cur[j] = prev[j - 1] + 1;
                else cur[j] = Math.max(prev[j], cur[j - 1]);
            }
            int[] tmp = prev; prev = cur; cur = tmp;
            Arrays.fill(cur, 0);
        }
        return prev[n];
    }
}
