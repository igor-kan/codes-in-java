package com.igorkan.modules.heavy_hitter_misra_gries;

public final class Errors {
    private Errors() {}

    public static final class MisraGriesException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public MisraGriesException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new MisraGriesException(msg);
        }
    }
}
