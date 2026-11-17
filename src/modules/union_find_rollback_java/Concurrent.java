package com.igorkan.modules.union_find_rollback_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Integer> parallelComponentsAfterEdges(int n, List<List<int[]>> scenarios) throws Exception {
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futs = scenarios.stream().map(edges -> pool.submit(() -> {
                Core dsu = new Core(n);
                FastPath.uniteAll(dsu, edges);
                return dsu.components();
            })).toList();
            List<Integer> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
