package com.igorkan.modules.li_chao_envelope_java;

public final class Validation {
    private Validation() {}
    public static void requirePositive(int n) {
        if (n <= 0) {
            throw new Errors.ModuleException(Errors.ErrorCode.INVALID_INPUT, "n must be > 0");
        }
    }
}
