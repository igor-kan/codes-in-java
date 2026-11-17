package com.igorkan.modules.bloom_counting_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        Core bf = new Core(1024, 4);
        long[] k1 = new long[40], k2 = new long[40];
        for (int i = 0; i < 40; i++) {
            k1[i] = 50000L + i;
            k2[i] = 90000L + i;
            bf.add(k1[i]);
        }
        var res = Concurrent.parallelBatchContainCount(bf, List.of(k1, k2));
        if (res.get(0) != 40 || res.get(1) > 3) throw new AssertionError("unexpected hits: " + res);
    }
}
