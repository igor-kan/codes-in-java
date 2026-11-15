package com.igorkan.modules.token_bucket_rate_guard;

public final class Types {
    private Types() {}
    public record RatePolicy(double capacity, double tokensPerSec) {}
    public record PermitDecision(boolean allowed, double remaining, long waitNanos) {}
}
