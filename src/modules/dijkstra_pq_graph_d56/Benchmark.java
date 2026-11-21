package com.igorkan.modules.dijkstra_pq_graph_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] f = {0, 1, 2}; int[] t = {1, 2, 3}; long[] w = {2, 3, 4};
        for (int it = 0; it < 200; it++) sink += c.shortestPaths(4, 0, f, t, w)[3];
        long ns = System.nanoTime() - t0;
        System.out.println("dijkstra_pq_graph_d56 ns=" + ns + " sink=" + sink);
    }
}
