package com.igorkan.modules.floyd_warshall_neg_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] us = {0,1,2,3,0,2}; int[] vs = {1,2,3,4,4,4}; long[] ws = {2,3,-1,4,20,5};
        for (int it = 0; it < 200; ++it) sink += c.allPairs(5, us, vs, ws)[0][4];
        long ns = System.nanoTime() - t0;
        System.out.println("floyd_warshall_neg_d60 ns=" + ns + " sink=" + sink);
    }
}
