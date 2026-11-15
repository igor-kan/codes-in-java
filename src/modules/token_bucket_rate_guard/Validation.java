package com.igorkan.modules.token_bucket_rate_guard;

public final class Validation {
    private Validation() {}
    public static void validatePolicy(Types.RatePolicy policy) {
        Errors.require(policy.capacity() > 0.0 && Double.isFinite(policy.capacity()), "invalid capacity");
        Errors.require(policy.tokensPerSec() > 0.0 && Double.isFinite(policy.tokensPerSec()), "invalid rate");
    }
}
