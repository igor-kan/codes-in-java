package com.igorkan.modules.token_bucket_rate_guard;

public final class Errors {
    private Errors() {}

    public static final class RateGuardException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public RateGuardException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new RateGuardException(msg);
        }
    }
}
