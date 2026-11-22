package com.igorkan.modules.fenwick_point_range_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core fw = new Core(); fw.init(16); fw.add(4, 9);
        for (int it = 0; it < 200; it++) sink += fw.rangeSum(0, 15);
        long ns = System.nanoTime() - t0;
        System.out.println("fenwick_point_range_d57 ns=" + ns + " sink=" + sink);
    }
}
