package com.igorkan.modules.gale_shapley_stable_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[][] pa = {{0, 1, 2, 3}, {1, 0, 2, 3}, {2, 1, 0, 3}, {0, 2, 1, 3}};
        int[][] pb = {{3, 1, 2, 0}, {1, 3, 0, 2}, {2, 0, 3, 1}, {0, 1, 2, 3}};
        for (int it = 0; it < 500; ++it) {
            sink += c.match(pa, pb)[0];
        }
        long ns = System.nanoTime() - t0;
        System.out.println("gale_shapley_stable_java_d61 ns=" + ns + " sink=" + sink);
    }
}
