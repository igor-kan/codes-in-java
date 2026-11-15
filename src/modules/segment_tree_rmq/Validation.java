package com.igorkan.modules.segment_tree_rmq;

public final class Validation {
    private Validation() {}
    public static void validateRange(int n, int l, int r) {
        Errors.require(n > 0 && l >= 0 && l <= r && r < n, "invalid segment range");
    }
}
