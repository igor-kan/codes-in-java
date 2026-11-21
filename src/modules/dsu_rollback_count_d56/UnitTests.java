package com.igorkan.modules.dsu_rollback_count_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core dsu = new Core();
        dsu.init(5);
        int s0 = dsu.snapshot();
        dsu.union(0, 1);
        dsu.union(1, 2);
        if (dsu.components() != 3) throw new AssertionError();
        dsu.rollback(s0);
        if (dsu.components() != 5 || dsu.find(0) == dsu.find(1)) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
