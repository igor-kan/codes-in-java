package com.igorkan.modules.bloom_counting_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Integer> parallelBatchContainCount(Core bf, List<long[]> batches) throws Exception {
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futs = batches.stream().map(keys -> pool.submit(() -> {
                int hits = 0;
                for (long k : keys) if (bf.mayContain(k)) hits++;
                return hits;
            })).toList();
            List<Integer> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
