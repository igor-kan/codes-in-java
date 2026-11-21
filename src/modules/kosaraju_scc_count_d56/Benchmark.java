package com.igorkan.modules.kosaraju_scc_count_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.countScc(4, new int[]{0,1,2,3}, new int[]{1,0,3,2});
        long ns = System.nanoTime() - t0;
        System.out.println("kosaraju_scc_count_d56 ns=" + ns + " sink=" + sink);
    }
}
