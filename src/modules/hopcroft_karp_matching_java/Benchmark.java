package com.igorkan.modules.hopcroft_karp_matching_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[][] es = {{0,0},{0,1},{1,0}}; for(int i=0;i<200;i++) sink += c.maxMatching(2, 2, es).cardinality();
        long ns = System.nanoTime() - t0;
        System.out.println("hopcroft_karp_matching_java ns=" + ns + " sink=" + sink);
    }
}
