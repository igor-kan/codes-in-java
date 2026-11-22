package com.igorkan.modules.tarjan_bridge_cut_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.articulationPoints(4, new int[]{0,1,2}, new int[]{1,2,3}).length;
        long ns = System.nanoTime() - t0;
        System.out.println("tarjan_bridge_cut_d57 ns=" + ns + " sink=" + sink);
    }
}
