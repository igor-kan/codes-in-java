package com.igorkan.modules.segment_tree_rmq;

public final class Errors {
    private Errors() {}

    public static final class SegTreeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SegTreeException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new SegTreeException(msg);
        }
    }
}
