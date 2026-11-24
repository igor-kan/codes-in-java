package com.igorkan.modules.aho_corasick_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); String[] p = {"he", "she", "hers"};
        for (int it = 0; it < 200; it++) sink += c.countMultiHits(p, "ahishers");
        long ns = System.nanoTime() - t0;
        System.out.println("aho_corasick_java_d59 ns=" + ns + " sink=" + sink);
    }
}
