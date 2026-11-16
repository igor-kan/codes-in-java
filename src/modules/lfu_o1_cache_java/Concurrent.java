package com.igorkan.modules.lfu_o1_cache_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static int parallelTraceHitSum(int cap, List<int[]> traces) throws Exception {
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, traces.size())))) {
            List<Future<Integer>> fs = traces.stream().map(tr -> pool.submit(() -> FastPath.runTraceHits(cap, tr))).toList();
            int sum = 0;
            for (Future<Integer> f : fs) sum += f.get();
            return sum;
        }
    }
}
