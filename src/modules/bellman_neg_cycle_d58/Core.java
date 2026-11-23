package com.igorkan.modules.bellman_neg_cycle_d58;

import java.util.*;

public final class Core implements Contract {
    @Override
    public boolean hasNegCycle(int n, int[] u, int[] v, long[] w) {
        long[] dist = new long[n];
        Arrays.fill(dist, Types.BIG_INF);
        dist[0] = 0;
        for (int it = 0; it < n - 1; it++) {
            boolean chg = false;
            for (int e = 0; e < u.length; e++) {
                if (dist[u[e]] < Types.BIG_INF && dist[u[e]] + w[e] < dist[v[e]]) {
                    dist[v[e]] = dist[u[e]] + w[e];
                    chg = true;
                }
            }
            if (!chg) break;
        }
        for (int e = 0; e < u.length; e++) {
            if (dist[u[e]] < Types.BIG_INF && dist[u[e]] + w[e] < dist[v[e]]) return true;
        }
        return false;
    }
}
