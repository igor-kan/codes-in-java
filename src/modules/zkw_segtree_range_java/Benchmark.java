package com.igorkan.modules.zkw_segtree_range_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); long[] v = {1,2,3,4,5,6}; for(int i=0;i<200;i++) sink += c.rangeSum(6, v, 1, 4);
        long ns = System.nanoTime() - t0;
        System.out.println("zkw_segtree_range_java ns=" + ns + " sink=" + sink);
    }
}
