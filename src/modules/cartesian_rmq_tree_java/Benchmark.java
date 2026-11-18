package com.igorkan.modules.cartesian_rmq_tree_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); long[] a = {9,3,7,1,8,5}; for(int i=0;i<200;i++) sink += c.queryRmqIndex(a, 0, 5);
        long ns = System.nanoTime() - t0;
        System.out.println("cartesian_rmq_tree_java ns=" + ns + " sink=" + sink);
    }
}
