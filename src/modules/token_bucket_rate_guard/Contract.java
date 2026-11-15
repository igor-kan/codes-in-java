package com.igorkan.modules.token_bucket_rate_guard;

public interface Contract {
    Types.PermitDecision tryAcquire(double cost, long nowNanos);
    double currentTokens();
}
