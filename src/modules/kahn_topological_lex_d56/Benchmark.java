package com.igorkan.modules.kahn_topological_lex_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.lexTopoSort(4, new int[]{0, 1, 2}, new int[]{1, 2, 3})[3];
        long ns = System.nanoTime() - t0;
        System.out.println("kahn_topological_lex_d56 ns=" + ns + " sink=" + sink);
    }
}
