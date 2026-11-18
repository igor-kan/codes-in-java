package com.igorkan.modules.sparse_table_idempotent_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long[] a = {12, 18, 24, 36, 9, 27};
        var s = c.queryRange(a, 0, 3);
        if (s.minVal() != 12L || s.gcdVal() != 6L) throw new AssertionError("got " + s);
        Invariants.ensure(true, "unit ok");
    }
}
