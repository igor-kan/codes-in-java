package com.igorkan.modules.lfu_o1_cache_java;

public final class FastPath {
    private FastPath() {}

    public static int runTraceHits(int capacity, int[] keys) {
        Core cache = new Core(capacity);
        int hits = 0;
        for (int k : keys) {
            if (cache.get(k) != -1) hits++;
            else cache.put(k, k * 10);
        }
        return hits;
    }
}
