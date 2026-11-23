package com.igorkan.modules.bellman_neg_cycle_d58;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (!c.hasNegCycle(3, new int[]{0,1,2}, new int[]{1,2,0}, new long[]{1,-3,1})) throw new AssertionError();
        if (c.hasNegCycle(3, new int[]{0,1,2}, new int[]{1,2,0}, new long[]{2,2,2})) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
