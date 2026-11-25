package com.igorkan.modules.edmonds_karp_java_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] u = {0,0,1,2,1,2,3};
        int[] v = {1,2,2,3,3,3,4};
        long[] w = {10,5,15,10,5,5,15};
        if (c.solveMaxFlow(5, 0, 4, u, v, w) != 15) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
