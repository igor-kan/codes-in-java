package com.igorkan.modules.prim_mst_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[] u = {0,1,2,0}; int[] v = {1,2,3,3}; long[] w = {2,3,4,9};
        for (int it = 0; it < 200; it++) sink += c.primMstWeight(4, u, v, w);
        long ns = System.nanoTime() - t0;
        System.out.println("prim_mst_java_d59 ns=" + ns + " sink=" + sink);
    }
}
