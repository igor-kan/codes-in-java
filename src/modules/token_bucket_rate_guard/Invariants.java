package com.igorkan.modules.token_bucket_rate_guard;

public final class Invariants {
    private Invariants() {}

    public static void verifyBalanceBounds(Core limiter, double capacity) {
        double bal = limiter.currentTokens();
        Errors.require(bal >= -1e-9 && bal <= capacity + 1e-9, "balance out of bounds: " + bal);
    }
}
