package com.igorkan.modules.fenwick_inversion_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[] a = {2,4,1,3,5}; for(int i=0;i<200;i++) sink += c.countInversions(a);
        long ns = System.nanoTime() - t0;
        System.out.println("fenwick_inversion_java ns=" + ns + " sink=" + sink);
    }
}
