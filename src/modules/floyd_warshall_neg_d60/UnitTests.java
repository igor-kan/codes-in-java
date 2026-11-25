package com.igorkan.modules.floyd_warshall_neg_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long[][] d = c.allPairs(4, new int[]{0,1,2,0}, new int[]{1,2,3,3}, new long[]{3,-1,2,10});
        if (c.hasNegativeCycle(d) || d[0][3] != 4) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
