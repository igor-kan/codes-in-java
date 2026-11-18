package com.igorkan.modules.sparse_table_idempotent_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); long[] a = {12,18,24,36}; for(int i=0;i<200;i++) sink += c.queryRange(a, 0, 3).gcdVal();
        long ns = System.nanoTime() - t0;
        System.out.println("sparse_table_idempotent_java ns=" + ns + " sink=" + sink);
    }
}
