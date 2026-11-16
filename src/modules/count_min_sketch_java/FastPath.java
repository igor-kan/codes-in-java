package com.igorkan.modules.count_min_sketch_java;

public final class FastPath {
    private FastPath() {}

    public static void batchIncrement(Core cms, long[] keys) {
        for (long k : keys) {
            cms.increment(k, 1L);
        }
    }
}
