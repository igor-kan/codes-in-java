package com.igorkan.modules.topological_kahn_java;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public final class Core implements Contract {
    @Override
    public Types.TopoResult sortDag(int n, List<int[]> edges) {
        Validation.validateEdges(n, edges);
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        int[] indeg = new int[n];
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            indeg[e[1]]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) pq.add(i);
        }
        List<Integer> order = new ArrayList<>(n);
        int[] depth = new int[n];
        int maxDepth = 0;
        while (!pq.isEmpty()) {
            int u = pq.poll();
            order.add(u);
            maxDepth = Math.max(maxDepth, depth[u]);
            for (int v : adj.get(u)) {
                depth[v] = Math.max(depth[v], depth[u] + 1);
                if (--indeg[v] == 0) pq.add(v);
            }
        }
        if (order.size() != n) {
            throw new Errors.TopoException(Errors.ErrorCode.INVARIANT_VIOLATION, "cycle detected in directed graph");
        }
        return new Types.TopoResult(order, maxDepth, depth);
    }
}
