package com.igorkan.modules.dijkstra_pq_graph_d56;

public interface Contract {
    long[] shortestPaths(int n, int src, int[] from, int[] to, long[] weight);
}
