package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}

    public static List<String> routeBatch(Core router, List<String> keys) {
        List<String> out = new ArrayList<>(keys.size());
        try (ExecutorService pool = Executors.newFixedThreadPool(4)) {
            List<Callable<String>> tasks = new ArrayList<>(keys.size());
            for (String k : keys) {
                tasks.add(() -> router.route(k));
            }
            for (Future<String> f : pool.invokeAll(tasks)) {
                out.add(f.get());
            }
        } catch (InterruptedException | ExecutionException ex) {
            throw new IllegalStateException(ex);
        }
        return out;
    }
}
