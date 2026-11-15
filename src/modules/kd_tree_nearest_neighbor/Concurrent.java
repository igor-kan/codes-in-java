package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static List<Types.NearestHit> batchNearest(Core kd, List<double[]> queries) {
        List<Types.NearestHit> out = new ArrayList<>(queries.size());
        try (ExecutorService pool = Executors.newFixedThreadPool(4)) {
            List<Callable<Types.NearestHit>> tasks = new ArrayList<>(queries.size());
            for (double[] q : queries) tasks.add(() -> kd.nearest(q));
            for (Future<Types.NearestHit> f : pool.invokeAll(tasks)) out.add(f.get());
        } catch (InterruptedException | ExecutionException ex) {
            throw new IllegalStateException(ex);
        }
        return out;
    }
}
