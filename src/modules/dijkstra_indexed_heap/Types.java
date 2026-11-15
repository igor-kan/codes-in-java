package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.List;

public final class Types {
    private Types() {}
    public record Edge(int to, double weight) {}
    public record PathResult(double[] dist, int[] parent) {}
    public static double[][] cloneAdjCheck(List<List<Edge>> adj) {
        return new double[adj.size()][];
    }
}
