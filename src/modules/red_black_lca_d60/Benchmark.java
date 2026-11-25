package com.igorkan.modules.red_black_lca_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core t = new Core();
        for (int i = 0; i < 64; ++i) t.insert((i * 19) % 64);
        for (int it = 0; it < 200; ++it) sink += t.select(it & 63);
        long ns = System.nanoTime() - t0;
        System.out.println("red_black_lca_d60 ns=" + ns + " sink=" + sink);
    }
}
