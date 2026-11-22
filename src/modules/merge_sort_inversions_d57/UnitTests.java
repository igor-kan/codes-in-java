package com.igorkan.modules.merge_sort_inversions_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.countInversions(new int[]{2, 4, 1, 3, 5}) != 3L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
