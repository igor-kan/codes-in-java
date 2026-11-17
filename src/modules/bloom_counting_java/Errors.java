package com.igorkan.modules.bloom_counting_java;

public final class Errors {
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class CountingBloomException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public CountingBloomException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
