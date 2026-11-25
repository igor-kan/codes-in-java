package com.igorkan.modules.edmonds_karp_java_d60;

import java.util.*;

public final class Core implements Contract {
    @Override public long solveMaxFlow(int n, int s, int t, int[] us, int[] vs, long[] caps) {
        long[][] cap = new long[n][n];
        for (int i = 0; i < us.length; ++i) cap[us[i]][vs[i]] += caps[i];
        int[] par = new int[n];
        long flow = 0;
        while (true) {
            Arrays.fill(par, -1);
            par[s] = s;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(s);
            while (!q.isEmpty() && par[t] == -1) {
                int u = q.poll();
                for (int v = 0; v < n; ++v) {
                    if (par[v] == -1 && cap[u][v] > 0) {
                        par[v] = u;
                        q.add(v);
                    }
                }
            }
            if (par[t] == -1) break;
            long push = Long.MAX_VALUE;
            for (int v = t; v != s; v = par[v]) push = Math.min(push, cap[par[v]][v]);
            for (int v = t; v != s; v = par[v]) {
                cap[par[v]][v] -= push;
                cap[v][par[v]] += push;
            }
            flow += push;
        }
        return flow;
    }
}
