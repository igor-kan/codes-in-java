package com.igorkan.modules.mergesort_inversions_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] base = {9,3,7,1,8,2,6,4,5,0};
        for (int it = 0; it < 200; ++it) sink += c.countInversions(base.clone());
        long ns = System.nanoTime() - t0;
        System.out.println("mergesort_inversions_d60 ns=" + ns + " sink=" + sink);
    }
}
