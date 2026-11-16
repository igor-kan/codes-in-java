package com.igorkan.modules.interval_coalesce_tree_java;

public final class Validation {
    private Validation() {}

    public static void validateRange(int lo, int hi) {
        Errors.require(lo <= hi, "interval lo must be <= hi");
    }
}
