package com.igorkan.modules.sliding_max_deque_d58;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        int[] xs = {2, 8, 1, 9, 4, 6};
        for (int it = 0; it < 200; it++) sink += c.maxSlidingWindow(xs, 3)[2];
        long ns = System.nanoTime() - t0;
        System.out.println("sliding_max_deque_d58 ns=" + ns + " sink=" + sink);
    }
}
