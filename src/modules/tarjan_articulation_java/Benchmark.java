package com.igorkan.modules.tarjan_articulation_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[][] es = {{0,1},{1,2},{2,0},{2,3}}; for(int i=0;i<200;i++) sink += c.analyze(4, es).bridges();
        long ns = System.nanoTime() - t0;
        System.out.println("tarjan_articulation_java ns=" + ns + " sink=" + sink);
    }
}
