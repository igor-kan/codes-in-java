package com.igorkan.modules.edmonds_karp_java_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] u = {0, 0, 1, 2};
        int[] v = {1, 2, 3, 3};
        long[] w = {7, 9, 7, 9};
        if (c.solveMaxFlow(4, 0, 3, u, v, w) != 16) throw new AssertionError();
    }
}
