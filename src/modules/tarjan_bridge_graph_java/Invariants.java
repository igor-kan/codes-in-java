package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.ArrayList;
import java.util.List;

public final class Invariants {
    private Invariants() {}

    public static void verifyOracle(int n, List<Types.Edge> edges, Types.BridgeReport rep) {
        List<Boolean> isBridge = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) isBridge.add(false);
        for (int id : rep.bridgeEdgeIds()) isBridge.set(id, true);
        Core solver = new Core();
        for (int skip = 0; skip < edges.size(); skip++) {
            List<Types.Edge> sub = new ArrayList<>();
            for (int j = 0; j < edges.size(); j++) if (j != skip) sub.add(edges.get(j));
            int comps = solver.findBridges(n, sub).components();
            boolean oracle = comps > rep.components();
            if (oracle != isBridge.get(skip)) {
                throw new Errors.BridgeException("bridge oracle mismatch at edge " + skip);
            }
        }
    }
}
