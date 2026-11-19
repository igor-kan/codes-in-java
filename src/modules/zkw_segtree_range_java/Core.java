package com.igorkan.modules.zkw_segtree_range_java;

import java.util.*;

public final class Core implements Contract {
    private int base;
    private long[] tree;
    public void init(int n) {
        base = 1;
        while (base < n + 2) base <<= 1;
        tree = new long[2 * base];
    }
    public void pointSet(int idx, long val) {
        int p = idx + 1 + base;
        tree[p] = val;
        for (p >>= 1; p > 0; p >>= 1) tree[p] = tree[p << 1] + tree[p << 1 | 1];
    }
    public long query(int l, int r) {
        long ans = 0;
        for (int s = l + base, t = r + 2 + base; (s ^ t ^ 1) != 0; s >>= 1, t >>= 1) {
            if ((~s & 1) != 0) ans += tree[s ^ 1];
            if (( t & 1) != 0) ans += tree[t ^ 1];
        }
        return ans;
    }
    @Override
    public long rangeSum(int n, long[] vals, int l, int r) {
        init(n);
        for (int i = 0; i < vals.length; i++) pointSet(i, vals[i]);
        return query(l, r);
    }
}
