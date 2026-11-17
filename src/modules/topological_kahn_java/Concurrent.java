package com.igorkan.modules.topological_kahn_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public record DagJob(int n, List<int[]> edges) {}
    public static List<Integer> parallelLongestPaths(List<DagJob> jobs) throws Exception {
        Core engine = new Core();
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futs = jobs.stream()
                .map(j -> pool.submit(() -> engine.sortDag(j.n(), j.edges()).longestPathLen()))
                .toList();
            List<Integer> out = new java.util.ArrayList<>(futs.size());
            for (var f : futs) out.add(f.get());
            return out;
        }
    }
}
