package com.igorkan.modules.token_bucket_rate_guard;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        Core guard = new Core(new Types.RatePolicy(10.0, 10.0), 0L);
        int granted = Concurrent.concurrentBurstAcquire(guard, 4, 20, 0L);
        assert granted == 10 : "expected exact burst cap 10 got " + granted;
        Invariants.verifyBalanceBounds(guard, 10.0);
    }
}
