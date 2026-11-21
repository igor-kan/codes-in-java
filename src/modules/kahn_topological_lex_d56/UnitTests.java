package com.igorkan.modules.kahn_topological_lex_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] ord = c.lexTopoSort(4, new int[]{2, 0, 1}, new int[]{0, 3, 3});
        if (!Arrays.equals(ord, new int[]{1, 2, 0, 3})) throw new AssertionError(Arrays.toString(ord));
        Invariants.ensure(true, "unit ok");
    }
}
