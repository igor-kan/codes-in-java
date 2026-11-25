package com.igorkan.modules.red_black_lca_d60;

public final class FastPath {
    private FastPath() {}
    public static long foldArray(long[] xs) {
        long h = 1469598103934665603L;
        for (long v : xs) {
            h = (h ^ v) * 1099511628211L;
        }
        return h;
    }
}
