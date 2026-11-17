package com.igorkan.modules.treap_split_merge_java;

public final class Validation {
    public static void requireRank(int size, int k) {
        if (k < 0 || k >= size) {
            throw new Errors.TreapException(Errors.ErrorCode.OUT_OF_BOUNDS, "k out of bounds");
        }
    }
}
