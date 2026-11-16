package com.igorkan.modules.heavy_hitter_misra_gries;

public final class FastPath {
    private FastPath() {}

    public static void ingestBatch(Core mg, long[] items) {
        for (long x : items) {
            mg.observe(x);
        }
    }
}
