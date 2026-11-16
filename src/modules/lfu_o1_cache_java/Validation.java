package com.igorkan.modules.lfu_o1_cache_java;

public final class Validation {
    private Validation() {}

    public static void checkCapacity(int cap) {
        Errors.require(cap > 0 && cap <= 1_000_000, "capacity out of range");
    }
}
