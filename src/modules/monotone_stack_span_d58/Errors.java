package com.igorkan.modules.monotone_stack_span_d58;

public final class Errors {
    private Errors() {}
    public enum ErrorCode { INVALID_INPUT, OUT_OF_BOUNDS, EMPTY_INPUT, INVARIANT_VIOLATION }
    public static final class ModuleException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public final ErrorCode code;
        public ModuleException(ErrorCode code, String msg) {
            super(msg);
            this.code = code;
        }
    }
}
