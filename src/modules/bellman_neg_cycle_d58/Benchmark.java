package com.igorkan.modules.bellman_neg_cycle_d58;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] u = {0,1,2}; int[] v = {1,2,0}; long[] w = {1,2,3};
        for (int it = 0; it < 200; it++) sink += c.hasNegCycle(3, u, v, w) ? 1 : 0;
        long ns = System.nanoTime() - t0;
        System.out.println("bellman_neg_cycle_d58 ns=" + ns + " sink=" + sink);
    }
}
