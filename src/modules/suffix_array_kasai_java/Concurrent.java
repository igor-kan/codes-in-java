package com.igorkan.modules.suffix_array_kasai_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Integer> parallelPatternCounts(List<String> docs, String pat) throws Exception {
        Core engine = new Core();
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futs = docs.stream()
                .map(d -> pool.submit(() -> FastPath.countOccurrences(engine.build(d), pat)))
                .toList();
            List<Integer> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
