package com.igorkan.modules.kd_tree_nearest_neighbor;

public final class Errors {
    private Errors() {}

    public static final class KdTreeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public KdTreeException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new KdTreeException(msg);
        }
    }
}
