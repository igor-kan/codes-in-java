package com.igorkan.modules.union_find_rollback_java;

public final class Validation {
    public static void requirePositive(int n) {
        if (n <= 0) throw new Errors.RollbackDsuException(Errors.ErrorCode.INVALID_INPUT, "n must be positive");
    }
    public static void requireVertex(int n, int x) {
        if (x < 0 || x >= n) throw new Errors.RollbackDsuException(Errors.ErrorCode.OUT_OF_BOUNDS, "vertex out of range");
    }
}
