package com.igorkan.modules.dijkstra_indexed_heap;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        int n = 200;
        java.util.List<java.util.List<Types.Edge>> adj = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            java.util.List<Types.Edge> r = new java.util.ArrayList<>();
            if (i + 1 < n) r.add(new Types.Edge(i + 1, 2.0));
            if (i + 7 < n) r.add(new Types.Edge(i + 7, 5.0));
            adj.add(r);
        }
        Core solver = new Core();
        long t0 = System.nanoTime();
        double sink = 0;
        for (int it = 0; it < 200; it++) sink += solver.shortestPaths(adj, 0).dist()[199];
        System.out.println("dijkstra_indexed_heap ns=" + (System.nanoTime() - t0) / 200 + " sink=" + sink);
    }
}
