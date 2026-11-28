package com.igorkan.modules.boruvka_mst_java_d61;

public final class Types {
    private Types() {}
    public record WeightedEdge(int u, int v, long w) {}
    public record MstSummary(long weight, int edges) {}
}
