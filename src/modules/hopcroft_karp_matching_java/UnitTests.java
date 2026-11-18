package com.igorkan.modules.hopcroft_karp_matching_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        var r = c.maxMatching(4, 4, new int[][]{{0,0},{0,1},{1,0},{2,2},{2,3},{3,2}});
        if (r.cardinality() != 4) throw new AssertionError("expected 4, got " + r.cardinality());
        Invariants.ensure(true, "unit ok");
    }
}
