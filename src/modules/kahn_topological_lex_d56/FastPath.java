package com.igorkan.modules.kahn_topological_lex_d56;

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
