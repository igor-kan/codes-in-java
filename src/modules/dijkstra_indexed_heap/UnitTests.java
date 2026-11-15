package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.List;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        List<List<Types.Edge>> adj = List.of(
            List.of(new Types.Edge(1, 10.0), new Types.Edge(2, 3.0)),
            List.of(new Types.Edge(3, 2.0)),
            List.of(new Types.Edge(1, 4.0), new Types.Edge(3, 8.0)),
            List.of()
        );
        Validation.validateNonNegative(adj, 0);
        Types.PathResult res = new Core().shortestPaths(adj, 0);
        Invariants.verifyOptimality(adj, res);
        assert Math.abs(res.dist()[3] - 9.0) < 1e-9;
        assert FastPath.reconstructPath(res, 3).equals(List.of(0, 2, 1, 3));
    }
}
