package com.igorkan.modules.lfu_o1_cache_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        int[] t1 = new int[200];
        int[] t2 = new int[200];
        for (int i = 0; i < 200; i++) {
            t1[i] = (i % 7 == 0) ? 1 : (i % 15);
            t2[i] = (i % 4 == 0) ? 2 : ((i * 5) % 12);
        }
        int total = Concurrent.parallelTraceHitSum(6, List.of(t1, t2));
        if (total <= 50) throw new AssertionError("unexpectedly low LFU hit sum: " + total);
    }
}
