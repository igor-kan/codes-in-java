package com.igorkan.modules.dsu_rollback_count_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core dsu = new Core(); dsu.init(8);
        for (int it = 0; it < 200; it++) { int s = dsu.snapshot(); dsu.union(0, 1); sink += dsu.components(); dsu.rollback(s); }
        long ns = System.nanoTime() - t0;
        System.out.println("dsu_rollback_count_d56 ns=" + ns + " sink=" + sink);
    }
}
