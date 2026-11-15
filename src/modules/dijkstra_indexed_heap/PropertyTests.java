package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.ArrayList;
import java.util.List;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        int n = 20;
        List<List<Types.Edge>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Types.Edge> row = new ArrayList<>();
            if (i + 1 < n) row.add(new Types.Edge(i + 1, (i % 7) + 1.0));
            if (i + 4 < n) row.add(new Types.Edge(i + 4, 3.5));
            adj.add(row);
        }
        List<Types.PathResult> all = Concurrent.allPairsParallel(adj);
        for (Types.PathResult r : all) Invariants.verifyOptimality(adj, r);
    }
}
