package com.igorkan.modules.stoer_wagner_mincut_java;

import java.util.*;

public final class Core implements Contract {
    @Override
    public Types.CutSummary globalMinCut(long[][] adj) {
        int n = adj.length;
        long[][] w = new long[n][n];
        for (int i = 0; i < n; i++) w[i] = adj[i].clone();
        int[] vtx = new int[n];
        for (int i = 0; i < n; i++) vtx[i] = i;
        long best = Long.MAX_VALUE / 4;
        int phases = 0;
        for (int m = n; m > 1; m--) {
            long[] weight = new long[m];
            boolean[] used = new boolean[m];
            int prev = -1, last = -1;
            for (int it = 0; it < m; it++) {
                int sel = -1;
                for (int i = 0; i < m; i++) {
                    if (!used[i] && (sel == -1 || weight[i] > weight[sel])) sel = i;
                }
                used[sel] = true; prev = last; last = sel;
                for (int i = 0; i < m; i++) if (!used[i]) weight[i] += w[vtx[sel]][vtx[i]];
            }
            best = Math.min(best, weight[last]);
            phases++;
            int u = vtx[prev], v = vtx[last];
            for (int i = 0; i < m; i++) {
                int k = vtx[i];
                if (k != u && k != v) { w[u][k] += w[v][k]; w[k][u] += w[k][v]; }
            }
            vtx[last] = vtx[m - 1];
        }
        return new Types.CutSummary(best, phases);
    }
}
