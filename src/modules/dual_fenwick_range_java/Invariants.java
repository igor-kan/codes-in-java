package com.igorkan.modules.dual_fenwick_range_java;

import java.util.List;

public final class Invariants {
    public static void verifyMatchesArray(int n, List<Types.RangeOp> ops) {
        Core df = new Core(n);
        long[] ref = new long[n];
        for (var op : ops) {
            df.rangeAdd(op.lo(), op.hi(), op.delta());
            for (int i = op.lo(); i <= op.hi(); i++) ref[i] += op.delta();
        }
        for (int l = 0; l < n; l++) {
            long acc = 0;
            for (int r = l; r < n; r++) {
                acc += ref[r];
                if (df.rangeSum(l, r) != acc) throw new AssertionError("mismatch at [" + l + "," + r + "]");
            }
        }
    }
}
