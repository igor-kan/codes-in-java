package com.igorkan.modules.floyd_warshall_neg_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        long[][] neg = c.allPairs(3, new int[]{0,1,2}, new int[]{1,2,0}, new long[]{1,-3,1});
        if (!c.hasNegativeCycle(neg)) throw new AssertionError("missed negative cycle");
    }
}
