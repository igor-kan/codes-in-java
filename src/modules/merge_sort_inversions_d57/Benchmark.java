package com.igorkan.modules.merge_sort_inversions_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.countInversions(new int[]{8, 4, 2, 1});
        long ns = System.nanoTime() - t0;
        System.out.println("merge_sort_inversions_d57 ns=" + ns + " sink=" + sink);
    }
}
