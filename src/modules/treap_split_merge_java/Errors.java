package com.igorkan.modules.treap_split_merge_java;

public final class Errors {
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class TreapException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public TreapException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
