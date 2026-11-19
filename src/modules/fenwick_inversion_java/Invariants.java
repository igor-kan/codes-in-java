package com.igorkan.modules.fenwick_inversion_java;

public final class Invariants {
    private Invariants() {}
    public static void ensure(boolean cond, String msg) {
        if (!cond) {
            throw new Errors.ModuleException(Errors.ErrorCode.INVARIANT_VIOLATION, msg);
        }
    }
}
