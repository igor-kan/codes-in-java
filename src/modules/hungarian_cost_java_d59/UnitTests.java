package com.igorkan.modules.hungarian_cost_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[][] m = {{4, 1, 3}, {2, 0, 5}, {3, 2, 2}};
        if (c.minAssignmentCost(m) != 5) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
