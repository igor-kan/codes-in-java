package com.igorkan.modules.monotone_stack_span_d58;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] p = {50, 40, 60, 30, 70};
        for (int it = 0; it < 200; it++) sink += c.backwardSpans(p)[4];
        long ns = System.nanoTime() - t0;
        System.out.println("monotone_stack_span_d58 ns=" + ns + " sink=" + sink);
    }
}
