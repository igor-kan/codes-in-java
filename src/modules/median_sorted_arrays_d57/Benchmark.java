package com.igorkan.modules.median_sorted_arrays_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] a = {1, 4, 7, 10}; int[] b = {2, 5, 8, 12};
        for (int it = 0; it < 200; it++) sink += (long) (c.findMedianSorted(a, b) * 10);
        long ns = System.nanoTime() - t0;
        System.out.println("median_sorted_arrays_d57 ns=" + ns + " sink=" + sink);
    }
}
