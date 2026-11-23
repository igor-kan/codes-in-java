package com.igorkan.modules.edit_dist_lev_d58;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int editDistance(String a, String b) {
        int m = a.length(), n = b.length();
        int[] prev = new int[n + 1];
        int[] cur = new int[n + 1];
        for (int j = 0; j <= n; j++) prev[j] = j;
        for (int i = 1; i <= m; i++) {
            cur[0] = i;
            for (int j = 1; j <= n; j++) {
                int c = a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1;
                cur[j] = Math.min(Math.min(prev[j] + 1, cur[j - 1] + 1), prev[j - 1] + c);
            }
            int[] tmp = prev; prev = cur; cur = tmp;
        }
        return prev[n];
    }
}
