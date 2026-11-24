package com.igorkan.modules.prim_mst_java_d59;

public final class Invariants {
    private Invariants() {}
    public static void ensure(boolean cond, String msg) {
        if (!cond) {
            throw new Errors.ModuleException(Errors.ErrorCode.INVARIANT_VIOLATION, msg);
        }
    }
}
