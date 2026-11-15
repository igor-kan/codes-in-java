package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static List<Types.PathResult> allPairsParallel(List<List<Types.Edge>> adj) {
        Core solver = new Core();
        List<Types.PathResult> out = new ArrayList<>(adj.size());
        try (ExecutorService pool = Executors.newFixedThreadPool(4)) {
            List<Callable<Types.PathResult>> tasks = new ArrayList<>(adj.size());
            for (int s = 0; s < adj.size(); s++) {
                final int src = s;
                tasks.add(() -> solver.shortestPaths(adj, src));
            }
            for (Future<Types.PathResult> f : pool.invokeAll(tasks)) out.add(f.get());
        } catch (InterruptedException | ExecutionException ex) {
            throw new IllegalStateException(ex);
        }
        return out;
    }
}
