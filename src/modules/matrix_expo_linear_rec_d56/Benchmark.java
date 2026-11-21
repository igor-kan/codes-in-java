package com.igorkan.modules.matrix_expo_linear_rec_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.fibMod(1000L + it);
        long ns = System.nanoTime() - t0;
        System.out.println("matrix_expo_linear_rec_d56 ns=" + ns + " sink=" + sink);
    }
}
