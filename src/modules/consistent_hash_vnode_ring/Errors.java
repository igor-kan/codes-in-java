package com.igorkan.modules.consistent_hash_vnode_ring;

public final class Errors {
    private Errors() {}

    public static final class RingException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public RingException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new RingException(msg);
        }
    }
}
