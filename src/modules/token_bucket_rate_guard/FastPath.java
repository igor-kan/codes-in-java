package com.igorkan.modules.token_bucket_rate_guard;

public final class FastPath {
    private FastPath() {}

    public static int drainBurst(Core limiter, long nowNanos) {
        int count = 0;
        while (limiter.tryAcquire(1.0, nowNanos).allowed()) count++;
        return count;
    }
}
