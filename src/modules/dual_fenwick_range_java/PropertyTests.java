package com.igorkan.modules.dual_fenwick_range_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        var totals = Concurrent.parallelShardTotals(10, List.of(
            List.of(new Types.RangeOp(0, 4, 3), new Types.RangeOp(2, 7, 2)),
            List.of(new Types.RangeOp(1, 8, 5))
        ));
        if (!totals.equals(List.of(27L, 40L))) throw new AssertionError("unexpected shard totals: " + totals);
    }
}
