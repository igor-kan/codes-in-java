package com.igorkan.modules.dual_fenwick_range_java;

public final class Validation {
    public static void requireSize(int n) {
        if (n <= 0) throw new Errors.DualFenwickException(Errors.ErrorCode.INVALID_INPUT, "n must be positive");
    }
    public static void requireRange(int n, int lo, int hi) {
        if (lo < 0 || hi >= n || lo > hi) {
            throw new Errors.DualFenwickException(Errors.ErrorCode.OUT_OF_BOUNDS, "range out of bounds");
        }
    }
}
