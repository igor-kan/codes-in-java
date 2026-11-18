package com.igorkan.modules.edmonds_blossom_lca_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.solveGeneralMatching(5, new int[][]{{0,1},{1,2},{2,3},{3,4},{4,0}}).matchedPairs() != 2) throw new AssertionError();
    }
}
