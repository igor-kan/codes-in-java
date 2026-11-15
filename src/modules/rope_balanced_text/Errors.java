package com.igorkan.modules.rope_balanced_text;

public final class Errors {
    private Errors() {}

    public static final class RopeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public RopeException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new RopeException(msg);
        }
    }
}
