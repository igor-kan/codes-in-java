package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;

public final class FastPath {
    private FastPath() {}

    public static int countBridges(int n, List<Types.Edge> edges) {
        return new Core().findBridges(n, edges).bridgeEdgeIds().size();
    }
}
