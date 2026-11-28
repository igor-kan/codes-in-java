package com.igorkan.modules.n_queens_bitmask_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; ++it) {
            sink += c.countSolutions(8);
        }
        long ns = System.nanoTime() - t0;
        System.out.println("n_queens_bitmask_java_d61 ns=" + ns + " sink=" + sink);
    }
}
