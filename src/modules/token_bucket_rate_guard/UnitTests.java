package com.igorkan.modules.token_bucket_rate_guard;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        Types.RatePolicy p = new Types.RatePolicy(5.0, 10.0);
        Validation.validatePolicy(p);
        Core guard = new Core(p, 0L);
        assert FastPath.drainBurst(guard, 0L) == 5;
        Types.PermitDecision d = guard.tryAcquire(1.0, 0L);
        assert !d.allowed() && d.waitNanos() == 100_000_000L;
        assert guard.tryAcquire(1.0, 100_000_000L).allowed();
        Invariants.verifyBalanceBounds(guard, p.capacity());
    }
}
