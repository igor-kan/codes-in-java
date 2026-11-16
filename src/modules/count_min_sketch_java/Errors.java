package com.igorkan.modules.count_min_sketch_java;

public final class Errors {
    private Errors() {}

    public static final class CmsException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public CmsException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new CmsException(msg);
        }
    }
}
