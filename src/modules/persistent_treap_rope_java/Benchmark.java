package com.igorkan.modules.persistent_treap_rope_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Types.Node r = Core.make(10L, 1, null, null); for(int i=0;i<200;i++) sink += Core.sum(r);
        long ns = System.nanoTime() - t0;
        System.out.println("persistent_treap_rope_java ns=" + ns + " sink=" + sink);
    }
}
