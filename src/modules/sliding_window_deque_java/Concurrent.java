package com.igorkan.modules.sliding_window_deque_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Long> parallelSpreadSums(List<int[]> arrays, int k) throws Exception {
        Core engine = new Core();
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Long>> futs = arrays.stream()
                .map(a -> pool.submit(() -> FastPath.rangeSpreadSum(engine.compute(a, k))))
                .toList();
            List<Long> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
