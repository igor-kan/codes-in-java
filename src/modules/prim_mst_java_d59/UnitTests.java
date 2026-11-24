package com.igorkan.modules.prim_mst_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long wt = c.primMstWeight(4, new int[]{0,0,0,1,2}, new int[]{1,2,3,3,3}, new long[]{10,6,5,15,4});
        if (wt != 19L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
