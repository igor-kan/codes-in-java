package com.igorkan.modules.dual_fenwick_range_java;

public final class Core implements Contract {
    private final int n;
    private final long[] b1;
    private final long[] b2;

    public Core(int n) {
        Validation.requireSize(n);
        this.n = n;
        this.b1 = new long[n + 2];
        this.b2 = new long[n + 2];
    }

    private void addBit(long[] bit, int pos, long delta) {
        for (; pos <= n; pos += pos & -pos) bit[pos] += delta;
    }

    private long queryBit(long[] bit, int pos) {
        long s = 0;
        for (; pos > 0; pos -= pos & -pos) s += bit[pos];
        return s;
    }

    @Override
    public void rangeAdd(int lo, int hi, long delta) {
        Validation.requireRange(n, lo, hi);
        int l1 = lo + 1, r1 = hi + 1;
        addBit(b1, l1, delta);
        addBit(b1, r1 + 1, -delta);
        addBit(b2, l1, delta * (l1 - 1));
        addBit(b2, r1 + 1, -delta * r1);
    }

    public long prefixSum(int idx) {
        if (idx < 0) return 0;
        int p = idx + 1;
        return queryBit(b1, p) * p - queryBit(b2, p);
    }

    @Override
    public long rangeSum(int lo, int hi) {
        Validation.requireRange(n, lo, hi);
        return prefixSum(hi) - (lo > 0 ? prefixSum(lo - 1) : 0);
    }
}
