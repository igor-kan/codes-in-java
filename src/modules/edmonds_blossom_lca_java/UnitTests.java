package com.igorkan.modules.edmonds_blossom_lca_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        var r = c.solveGeneralMatching(6, new int[][]{{0,1},{1,2},{2,0},{2,3},{3,4},{4,5},{5,3}});
        if (r.matchedPairs() != 3) throw new AssertionError("expected 3 pairs on two linked triangles, got " + r.matchedPairs());
        Invariants.ensure(true, "unit ok");
    }
}
