package com.igorkan.modules.dual_fenwick_range_java;

public final class Errors {
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class DualFenwickException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public DualFenwickException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
