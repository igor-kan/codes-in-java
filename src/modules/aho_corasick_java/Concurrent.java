package com.igorkan.modules.aho_corasick_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static int parallelScanCount(Core ac, List<String> docs) throws Exception {
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, docs.size())))) {
            List<Future<Integer>> fs = docs.stream().map(d -> pool.submit(() -> FastPath.countMatches(ac, d))).toList();
            int total = 0;
            for (Future<Integer> f : fs) total += f.get();
            return total;
        }
    }
}
