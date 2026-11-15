package com.igorkan.modules.token_bucket_rate_guard;

public final class Core implements Contract {
    private final double capacity;
    private final double tokensPerNs;
    private double tokens;
    private long lastNanos;

    public Core(Types.RatePolicy policy, long startNanos) {
        this.capacity = policy.capacity();
        this.tokensPerNs = policy.tokensPerSec() / 1_000_000_000.0;
        this.tokens = policy.capacity();
        this.lastNanos = startNanos;
    }

    @Override
    public synchronized Types.PermitDecision tryAcquire(double cost, long nowNanos) {
        if (nowNanos > lastNanos) {
            tokens = Math.min(capacity, tokens + (nowNanos - lastNanos) * tokensPerNs);
            lastNanos = nowNanos;
        }
        if (tokens >= cost) {
            tokens -= cost;
            return new Types.PermitDecision(true, tokens, 0L);
        }
        double deficit = cost - tokens;
        long wait = (long) Math.ceil(deficit / tokensPerNs);
        return new Types.PermitDecision(false, tokens, wait);
    }

    @Override
    public synchronized double currentTokens() {
        return tokens;
    }
}
