package com.igorkan.modules.interval_coalesce_tree_java;

public final class Errors {
    private Errors() {}

    public static final class IntervalException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public IntervalException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new IntervalException(msg);
        }
    }
}
