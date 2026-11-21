package com.igorkan.modules.lcs_hirschberg_dp_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] x = {1,2,3,4,5,6}; int[] y = {2,4,5,7,6};
        for (int it = 0; it < 200; it++) sink += c.lcsLength(x, y);
        long ns = System.nanoTime() - t0;
        System.out.println("lcs_hirschberg_dp_d56 ns=" + ns + " sink=" + sink);
    }
}
