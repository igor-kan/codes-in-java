package com.igorkan.modules.fenwick_inversion_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        if (new Core().countInversions(new int[]{2, 4, 1, 3, 5}) != 3L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
