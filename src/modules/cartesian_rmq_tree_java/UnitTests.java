package com.igorkan.modules.cartesian_rmq_tree_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long[] a = {9, 3, 7, 1, 8, 12, 10, 20, 15, 18, 5};
        if (c.queryRmqIndex(a, 0, 2) != 1 || c.queryRmqIndex(a, 4, 10) != 10) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
