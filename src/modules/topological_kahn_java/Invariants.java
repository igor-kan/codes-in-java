package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class Invariants {
    public static void verifyTopo(int n, List<int[]> edges, Types.TopoResult res) {
        if (res.order().size() != n || !FastPath.isValidOrder(n, edges, res.order())) {
            throw new AssertionError("topological ordering violated DAG edge constraint");
        }
    }
}
