package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.ArrayList;
import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        // Deep 10,000-node chain test (proves no recursion overflow) + parallel oracle verification
        List<Types.Edge> chain = new ArrayList<>();
        for (int i = 0; i < 10000; i++) chain.add(new Types.Edge(i, i + 1));
        if (FastPath.countBridges(10001, chain) != 10000) throw new AssertionError("chain bridge count wrong");

        List<Types.Edge> small = List.of(
            new Types.Edge(0,1), new Types.Edge(1,2), new Types.Edge(2,3),
            new Types.Edge(1,0), new Types.Edge(3,4)
        );
        var reps = Concurrent.batchAnalyze(5, List.of(small, small));
        Invariants.verifyOracle(5, small, reps.get(0));
    }
}
