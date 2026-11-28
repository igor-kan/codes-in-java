package com.igorkan.modules.gale_shapley_stable_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] got = c.match(new int[][]{{0, 1}, {1, 0}}, new int[][]{{1, 0}, {0, 1}});
        if (got.length != 2 || got[0] != 0 || got[1] != 1) throw new AssertionError("basic");
        int[] cross = c.match(new int[][]{{1, 0}, {0, 1}}, new int[][]{{1, 0}, {0, 1}});
        if (cross[0] != 1 || cross[1] != 0) throw new AssertionError("cross");
        Invariants.ensure(true, "unit ok");
    }
}
