package com.igorkan.modules.edmonds_karp_java_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] u = {0,0,1,2}; int[] v = {1,2,3,3}; long[] w = {10,12,8,15};
        for (int it = 0; it < 200; ++it) sink += c.solveMaxFlow(4, 0, 3, u, v, w);
        long ns = System.nanoTime() - t0;
        System.out.println("edmonds_karp_java_d60 ns=" + ns + " sink=" + sink);
    }
}
