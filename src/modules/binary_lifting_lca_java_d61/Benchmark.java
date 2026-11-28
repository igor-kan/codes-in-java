package com.igorkan.modules.binary_lifting_lca_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] parent = new int[64];
        for (int i = 0; i < parent.length; ++i) parent[i] = i == 0 ? 0 : (i - 1) / 2;
        Types.LcaTable table = c.build(parent);
        for (int it = 0; it < 500; ++it) {
            sink += c.lca(table, it & 63, (it * 7) & 63);
        }
        long ns = System.nanoTime() - t0;
        System.out.println("binary_lifting_lca_java_d61 ns=" + ns + " sink=" + sink);
    }
}
