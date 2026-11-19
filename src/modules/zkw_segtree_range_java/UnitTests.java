package com.igorkan.modules.zkw_segtree_range_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        if (new Core().rangeSum(6, new long[]{10,20,30,40,50,60}, 1, 4) != 140L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
