package com.igorkan.modules.dual_fenwick_range_java;

import java.util.List;

public final class UnitTests {
    public static void main(String[] args) {
        Invariants.verifyMatchesArray(12, List.of(
            new Types.RangeOp(0, 5, 4),
            new Types.RangeOp(3, 9, -2),
            new Types.RangeOp(4, 4, 7),
            new Types.RangeOp(0, 11, 1)
        ));
    }
}
