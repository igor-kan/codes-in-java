package com.igorkan.modules.count_min_sketch_java;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static Types.CmsTable parallelMergeShards(int width, int depth, long seed, List<long[]> shards) throws Exception {
        Types.CmsTable merged = Validation.createValidated(width, depth, seed);
        Core dst = new Core(merged);
        try (var pool = Executors.newFixedThreadPool(Math.min(4, Math.max(1, shards.size())))) {
            List<Future<Types.CmsTable>> futs = shards.stream().map(sh -> pool.submit((Callable<Types.CmsTable>) () -> {
                Core local = new Core(new Types.CmsTable(width, depth, seed));
                FastPath.batchIncrement(local, sh);
                return local.table;
            })).toList();
            for (Future<Types.CmsTable> f : futs) {
                dst.merge(f.get());
            }
        }
        return merged;
    }
}
