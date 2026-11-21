package com.igorkan.modules.matrix_expo_linear_rec_d56;

public final class Validation {
    private Validation() {}
    public static void requirePositive(int n) {
        if (n <= 0) {
            throw new Errors.ModuleException(Errors.ErrorCode.INVALID_INPUT, "n must be > 0");
        }
    }
}
