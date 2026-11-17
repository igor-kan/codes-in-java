package com.igorkan.modules.treap_split_merge_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static List<Integer> parallelBatchInsertMedian(List<int[]> batches) throws Exception {
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futs = batches.stream().map(arr -> pool.submit(() -> {
                Core t = new Core();
                for (int x : arr) t.insert(x);
                return t.kthSmallest(t.size() / 2);
            })).toList();
            List<Integer> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
