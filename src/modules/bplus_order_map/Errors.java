package com.igorkan.modules.bplus_order_map;

public final class Errors {
    private Errors() {}

    public static final class BPlusException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public BPlusException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new BPlusException(msg);
        }
    }
}
