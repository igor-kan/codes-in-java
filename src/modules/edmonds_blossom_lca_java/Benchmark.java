package com.igorkan.modules.edmonds_blossom_lca_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[][] es = {{0,1},{1,2},{2,0},{2,3}}; for(int i=0;i<100;i++) sink += c.solveGeneralMatching(4, es).matchedPairs();
        long ns = System.nanoTime() - t0;
        System.out.println("edmonds_blossom_lca_java ns=" + ns + " sink=" + sink);
    }
}
