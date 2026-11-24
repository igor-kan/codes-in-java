package com.igorkan.modules.bipartite_check_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[] u = {0,1,2,3}; int[] v = {1,2,3,0};
        for (int it = 0; it < 200; it++) sink += c.isBipartite(4, u, v) ? 1 : 0;
        long ns = System.nanoTime() - t0;
        System.out.println("bipartite_check_java_d59 ns=" + ns + " sink=" + sink);
    }
}
