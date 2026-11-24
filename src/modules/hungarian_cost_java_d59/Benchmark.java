package com.igorkan.modules.hungarian_cost_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); int[][] m = {{4, 2, 8}, {4, 3, 7}, {3, 1, 6}};
        for (int it = 0; it < 200; it++) sink += c.minAssignmentCost(m);
        long ns = System.nanoTime() - t0;
        System.out.println("hungarian_cost_java_d59 ns=" + ns + " sink=" + sink);
    }
}
