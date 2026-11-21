package com.igorkan.modules.dijkstra_pq_graph_d56;

import java.util.*;

public final class Core implements Contract {
    @Override
    public long[] shortestPaths(int n, int src, int[] from, int[] to, long[] weight) {
        List<List<long[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < from.length; i++) adj.get(from[i]).add(new long[]{to[i], weight[i]});
        long[] dist = new long[n];
        Arrays.fill(dist, Types.INF);
        dist[src] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.add(new long[]{0L, src});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (d > dist[u]) continue;
            for (long[] e : adj.get(u)) {
                int v = (int) e[0];
                long w = e[1];
                if (d + w < dist[v]) {
                    dist[v] = d + w;
                    pq.add(new long[]{dist[v], v});
                }
            }
        }
        return dist;
    }
}
