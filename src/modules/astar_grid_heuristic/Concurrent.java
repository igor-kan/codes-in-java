package com.igorkan.modules.astar_grid_heuristic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static List<Types.GridPath> batchPaths(int[][] grid, List<Types.Cell[]> pairs) {
        Core solver = new Core();
        List<Types.GridPath> out = new ArrayList<>(pairs.size());
        try (ExecutorService pool = Executors.newFixedThreadPool(4)) {
            List<Callable<Types.GridPath>> tasks = new ArrayList<>(pairs.size());
            for (Types.Cell[] pair : pairs) tasks.add(() -> solver.findPath(grid, pair[0], pair[1]));
            for (Future<Types.GridPath> f : pool.invokeAll(tasks)) out.add(f.get());
        } catch (InterruptedException | ExecutionException ex) {
            throw new IllegalStateException(ex);
        }
        return out;
    }
}
