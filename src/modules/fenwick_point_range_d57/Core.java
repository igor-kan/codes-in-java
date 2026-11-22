package com.igorkan.modules.fenwick_point_range_d57;

import java.util.*;

public final class Core implements Contract {
    private long[] bit;
    private int n;

    public void init(int size) {
        this.n = size;
        this.bit = new long[size + 1];
    }

    public void add(int idx, long delta) {
        for (int i = idx + 1; i <= n; i += i & -i) bit[i] += delta;
    }

    public long prefixSum(int idx) {
        long s = 0;
        for (int i = idx + 1; i > 0; i -= i & -i) s += bit[i];
        return s;
    }

    @Override
    public long rangeSum(int l, int r) {
        return prefixSum(r) - (l > 0 ? prefixSum(l - 1) : 0L);
    }
}
