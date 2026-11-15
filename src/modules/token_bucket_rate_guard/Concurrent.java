package com.igorkan.modules.token_bucket_rate_guard;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class Concurrent {
    private Concurrent() {}

    public static int concurrentBurstAcquire(Core limiter, int threads, int perThread, long fixedTs) {
        AtomicInteger granted = new AtomicInteger(0);
        try (ExecutorService pool = Executors.newFixedThreadPool(threads)) {
            List<Callable<Void>> tasks = new ArrayList<>();
            for (int t = 0; t < threads; t++) {
                tasks.add(() -> {
                    for (int i = 0; i < perThread; i++) {
                        if (limiter.tryAcquire(1.0, fixedTs).allowed()) granted.incrementAndGet();
                    }
                    return null;
                });
            }
            for (Future<Void> f : pool.invokeAll(tasks)) f.get();
        } catch (InterruptedException | ExecutionException ex) {
            throw new IllegalStateException(ex);
        }
        return granted.get();
    }
}
