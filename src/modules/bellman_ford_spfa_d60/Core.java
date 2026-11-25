package com.igorkan.modules.bellman_ford_spfa_d60;

import java.util.*;

public final class Core implements Contract {
    @Override public long[] shortestPaths(int n, int src, int[] us, int[] vs, long[] ws) {
        List<List<int[]>> g = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) g.add(new ArrayList<>());
        for (int i = 0; i < us.length; ++i) g.get(us[i]).add(new int[]{vs[i], (int) ws[i]});
        long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        boolean[] inQ = new boolean[n];
        int[] cnt = new int[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(src);
        inQ[src] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            inQ[u] = false;
            for (int[] e : g.get(u)) {
                int v = e[0]; long w = e[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    if (!inQ[v]) {
                        q.add(v);
                        inQ[v] = true;
                        if (++cnt[v] >= n) return null;
                    }
                }
            }
        }
        return dist;
    }
}
