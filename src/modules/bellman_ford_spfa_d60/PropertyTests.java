package com.igorkan.modules.bellman_ford_spfa_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        long[] bad = c.shortestPaths(3, 0, new int[]{0,1,2}, new int[]{1,2,0}, new long[]{1,-5,1});
        if (bad != null) throw new AssertionError("negative cycle should return null");
    }
}
