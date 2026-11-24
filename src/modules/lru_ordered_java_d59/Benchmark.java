package com.igorkan.modules.lru_ordered_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); c.init(8);
        for (int it = 0; it < 200; it++) { c.put(it & 15, it); sink += c.get(it & 7); }
        long ns = System.nanoTime() - t0;
        System.out.println("lru_ordered_java_d59 ns=" + ns + " sink=" + sink);
    }
}
