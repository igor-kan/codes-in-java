package com.igorkan.modules.aho_corasick_java;

public final class Errors {
    private Errors() {}

    public static final class AcJavaException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public AcJavaException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new AcJavaException(msg);
        }
    }
}
