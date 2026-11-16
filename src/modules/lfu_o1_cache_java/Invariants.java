package com.igorkan.modules.lfu_o1_cache_java;

public final class Invariants {
    private Invariants() {}

    public static void verify(Core cache) {
        if (cache.size() > cache.capacity) throw new Errors.LfuException("size > capacity");
        int sumSizes = 0;
        for (Types.FreqBucket b : cache.buckets.values()) sumSizes += b.size;
        if (sumSizes != cache.size()) throw new Errors.LfuException("bucket accounting mismatch");
    }
}
