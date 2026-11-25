package com.igorkan.modules.bellman_ford_spfa_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] us = {0,0,1,2,3}; int[] vs = {1,2,3,3,4}; long[] ws = {4,2,5,1,3};
        for (int it = 0; it < 200; ++it) sink += c.shortestPaths(5, 0, us, vs, ws)[4];
        long ns = System.nanoTime() - t0;
        System.out.println("bellman_ford_spfa_d60 ns=" + ns + " sink=" + sink);
    }
}
