package com.igorkan.modules.bellman_ford_spfa_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long[] d = c.shortestPaths(4, 0, new int[]{0,0,1,2}, new int[]{1,2,3,1}, new long[]{5,3,1,-2});
        if (d == null || d[1] != 1 || d[3] != 2) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
