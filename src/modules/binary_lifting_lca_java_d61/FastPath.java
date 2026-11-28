package com.igorkan.modules.binary_lifting_lca_java_d61;

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
