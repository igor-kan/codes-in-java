package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.List;

public final class Invariants {
    private Invariants() {}

    public static void verifyOptimality(List<List<Types.Edge>> adj, Types.PathResult res) {
        double[] d = res.dist();
        for (int u = 0; u < adj.size(); u++) {
            if (!Double.isFinite(d[u])) continue;
            for (Types.Edge e : adj.get(u)) {
                Errors.require(d[u] + e.weight() + 1e-12 >= d[e.to()], "unrelaxed shortest-path edge");
            }
        }
    }
}
