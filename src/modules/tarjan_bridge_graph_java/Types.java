package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;

public final class Types {
    private Types() {}

    public record Edge(int u, int v) {}

    public record BridgeReport(List<Integer> bridgeEdgeIds, int components) {}
}
