package com.igorkan.modules.sparse_table_idempotent_java;

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
