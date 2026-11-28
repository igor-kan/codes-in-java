package com.igorkan.modules.boruvka_mst_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int n = 32;
        Types.WeightedEdge[] edges = new Types.WeightedEdge[64];
        for (int i = 0; i < n; ++i) {
            edges[2 * i] = new Types.WeightedEdge(i, (i * 7 + 3) % n, (i * 13) % 97 + 1L);
            edges[2 * i + 1] = new Types.WeightedEdge(i, (i + 1) % n, (i * 5) % 41 + 2L);
        }
        for (int it = 0; it < 2000; ++it) {
            sink += c.minimumSpanningTree(n, edges).weight();
        }
        long ns = System.nanoTime() - t0;
        System.out.println("boruvka_mst_java_d61 ns=" + ns + " sink=" + sink);
    }
}
