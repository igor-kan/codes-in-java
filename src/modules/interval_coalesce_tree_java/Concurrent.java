package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static Core parallelReduceUnion(List<List<Types.Interval>> shards) throws Exception {
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, shards.size())))) {
            List<Future<Core>> fs = shards.stream().map(sh -> pool.submit(() -> FastPath.mergeAll(sh))).toList();
            Core merged = new Core();
            for (Future<Core> f : fs) {
                for (Types.Interval iv : f.get().snapshot()) {
                    merged.addRange(iv.lo(), iv.hi());
                }
            }
            return merged;
        }
    }
}
