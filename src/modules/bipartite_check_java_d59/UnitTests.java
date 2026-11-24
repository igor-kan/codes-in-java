package com.igorkan.modules.bipartite_check_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (!c.isBipartite(4, new int[]{0,1,2,3}, new int[]{1,2,3,0})) throw new AssertionError();
        if (c.isBipartite(3, new int[]{0,1,2}, new int[]{1,2,0})) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
