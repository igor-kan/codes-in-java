package com.igorkan.modules.hungarian_cost_java_d59;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    private Concurrent() {}
    public static long parallelFoldPair(long[] a, long[] b) throws Exception {
        try (var pool = Executors.newFixedThreadPool(2)) {
            Future<Long> fa = pool.submit(() -> FastPath.foldArray(a));
            Future<Long> fb = pool.submit(() -> FastPath.foldArray(b));
            return fa.get() ^ fb.get();
        }
    }
}
