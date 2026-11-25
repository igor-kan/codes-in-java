package com.igorkan.modules.mergesort_inversions_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] a = {2, 4, 1, 3, 5};
        if (c.countInversions(a) != 3L || a[0] != 1 || a[4] != 5) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
