package com.igorkan.modules.median_sorted_arrays_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (Math.abs(c.findMedianSorted(new int[]{1, 3}, new int[]{2}) - 2.0) > 1e-9) throw new AssertionError();
        if (Math.abs(c.findMedianSorted(new int[]{1, 2}, new int[]{3, 4}) - 2.5) > 1e-9) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
