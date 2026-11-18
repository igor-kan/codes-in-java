package com.igorkan.modules.vose_alias_sampler_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); var t = Core.build(new double[]{1,2,3,4}); for(int i=0;i<200;i++) sink += c.sample(t, i & 3, 0.5);
        long ns = System.nanoTime() - t0;
        System.out.println("vose_alias_sampler_java ns=" + ns + " sink=" + sink);
    }
}
