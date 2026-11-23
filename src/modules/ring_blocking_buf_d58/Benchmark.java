package com.igorkan.modules.ring_blocking_buf_d58;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core rq = new Core(); rq.init(8);
        for (int it = 0; it < 200; it++) { rq.offer(it); sink += rq.pollOrDefault(0); }
        long ns = System.nanoTime() - t0;
        System.out.println("ring_blocking_buf_d58 ns=" + ns + " sink=" + sink);
    }
}
