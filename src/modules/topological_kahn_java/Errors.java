package com.igorkan.modules.topological_kahn_java;

public final class Errors {
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class TopoException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public TopoException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
