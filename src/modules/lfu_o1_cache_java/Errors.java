package com.igorkan.modules.lfu_o1_cache_java;

public final class Errors {
    private Errors() {}

    public static final class LfuException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public LfuException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new LfuException(msg);
        }
    }
}
