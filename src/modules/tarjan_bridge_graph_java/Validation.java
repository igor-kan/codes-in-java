package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;

public final class Validation {
    private Validation() {}

    public static void validate(int n, List<Types.Edge> edges) {
        Errors.require(n > 0, "vertex count must be > 0");
        Errors.require(edges != null, "edges cannot be null");
        for (Types.Edge e : edges) {
            Errors.require(e.u() >= 0 && e.u() < n && e.v() >= 0 && e.v() < n, "edge vertex out of range");
        }
    }
}
