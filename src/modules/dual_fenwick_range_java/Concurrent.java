package com.igorkan.modules.dual_fenwick_range_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Long> parallelShardTotals(int n, List<List<Types.RangeOp>> shards) throws Exception {
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Long>> futs = shards.stream().map(ops -> pool.submit(() -> {
                Core df = new Core(n);
                FastPath.applyOps(df, ops);
                return df.rangeSum(0, n - 1);
            })).toList();
            List<Long> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
