package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;

public final class UnitTests {
    public static void main(String[] args) {
        List<Types.Edge> g = List.of(
            new Types.Edge(0, 1), new Types.Edge(1, 2), new Types.Edge(2, 0),
            new Types.Edge(1, 3),
            new Types.Edge(3, 4), new Types.Edge(4, 5), new Types.Edge(5, 3)
        );
        Types.BridgeReport rep = new Core().findBridges(6, g);
        if (!rep.bridgeEdgeIds().equals(List.of(3))) throw new AssertionError("expected bridge edge 3");
        Invariants.verifyOracle(6, g, rep);
    }
}
