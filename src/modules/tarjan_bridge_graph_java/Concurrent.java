package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static List<Types.BridgeReport> batchAnalyze(int n, List<List<Types.Edge>> graphs) throws Exception {
        Core engine = new Core();
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, graphs.size())))) {
            List<Future<Types.BridgeReport>> futs = graphs.stream().map(g -> pool.submit(() -> engine.findBridges(n, g))).toList();
            return futs.stream().map(f -> {
                try { return f.get(); } catch (Exception ex) { throw new RuntimeException(ex); }
            }).toList();
        }
    }
}
