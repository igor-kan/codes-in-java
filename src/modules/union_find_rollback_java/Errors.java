package com.igorkan.modules.union_find_rollback_java;

public final class Errors {
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class RollbackDsuException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public RollbackDsuException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
