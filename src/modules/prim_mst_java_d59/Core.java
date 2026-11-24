package com.igorkan.modules.prim_mst_java_d59;

import java.util.*;

public final class Core implements Contract {
    @Override
    public long primMstWeight(int n, int[] u, int[] v, long[] w) {
        List<List<long[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < u.length; i++) {
            adj.get(u[i]).add(new long[]{v[i], w[i]});
            adj.get(v[i]).add(new long[]{u[i], w[i]});
        }
        boolean[] vis = new boolean[n];
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[]{0L, 0L});
        long total = 0;
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            int node = (int) cur[0];
            if (vis[node]) continue;
            vis[node] = true;
            total += cur[1];
            for (long[] e : adj.get(node)) {
                if (!vis[(int) e[0]]) pq.add(e);
            }
        }
        return total;
    }
}
