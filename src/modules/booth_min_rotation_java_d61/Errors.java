package com.igorkan.modules.booth_min_rotation_java_d61;

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
