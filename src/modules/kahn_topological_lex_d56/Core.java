package com.igorkan.modules.kahn_topological_lex_d56;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int[] lexTopoSort(int n, int[] u, int[] v) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        int[] ind = new int[n];
        for (int i = 0; i < u.length; i++) {
            adj.get(u[i]).add(v[i]);
            ind[v[i]]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) if (ind[i] == 0) pq.add(i);
        int[] order = new int[n];
        int idx = 0;
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            order[idx++] = cur;
            for (int nxt : adj.get(cur)) {
                if (--ind[nxt] == 0) pq.add(nxt);
            }
        }
        return idx == n ? order : new int[0];
    }
}
