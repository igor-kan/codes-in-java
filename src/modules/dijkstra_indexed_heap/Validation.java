package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.List;

public final class Validation {
    private Validation() {}

    public static void validateNonNegative(List<List<Types.Edge>> adj, int source) {
        Errors.require(adj != null && !adj.isEmpty(), "empty graph");
        Errors.require(source >= 0 && source < adj.size(), "source out of bounds");
        for (List<Types.Edge> row : adj) {
            for (Types.Edge e : row) {
                Errors.require(e.to() >= 0 && e.to() < adj.size(), "vertex out of bounds");
                Errors.require(e.weight() >= 0.0 && Double.isFinite(e.weight()), "negative edge weight");
            }
        }
    }
}
