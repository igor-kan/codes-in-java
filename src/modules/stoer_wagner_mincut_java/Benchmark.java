package com.igorkan.modules.stoer_wagner_mincut_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); long[][] g = {{0,3,1},{3,0,2},{1,2,0}}; for(int i=0;i<200;i++) sink += c.globalMinCut(g).minCut();
        long ns = System.nanoTime() - t0;
        System.out.println("stoer_wagner_mincut_java ns=" + ns + " sink=" + sink);
    }
}
