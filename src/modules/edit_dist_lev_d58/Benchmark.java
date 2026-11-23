package com.igorkan.modules.edit_dist_lev_d58;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.editDistance("benchmark", "benchamrk");
        long ns = System.nanoTime() - t0;
        System.out.println("edit_dist_lev_d58 ns=" + ns + " sink=" + sink);
    }
}
