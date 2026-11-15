package com.igorkan.modules.token_bucket_rate_guard;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        Core guard = new Core(new Types.RatePolicy(1000.0, 5000.0), 0L);
        long t0 = System.nanoTime();
        int sink = 0;
        for (long i = 0; i < 50000; i++) {
            if (guard.tryAcquire(1.0, i * 1_000_000L).allowed()) sink++;
        }
        System.out.println("token_bucket_rate_guard ns=" + (System.nanoTime() - t0) / 50000 + " sink=" + sink);
    }
}
