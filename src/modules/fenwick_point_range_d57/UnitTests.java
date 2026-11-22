package com.igorkan.modules.fenwick_point_range_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core fw = new Core();
        fw.init(6);
        fw.add(1, 5); fw.add(3, 10); fw.add(5, -2);
        if (fw.rangeSum(1, 5) != 13 || fw.rangeSum(0, 2) != 5) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
