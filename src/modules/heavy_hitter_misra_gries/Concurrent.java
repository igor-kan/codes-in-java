package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static Core parallelSummary(int k, List<long[]> shards) throws Exception {
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, shards.size())))) {
            List<Future<Core>> fs = shards.stream().map(s -> pool.submit(() -> {
                Core local = new Core(k);
                FastPath.ingestBatch(local, s);
                return local;
            })).toList();
            Core merged = new Core(k);
            for (Future<Core> f : fs) merged.merge(f.get());
            return merged;
        }
    }
}
