package com.igorkan.modules.bellman_neg_cycle_d58;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.hasNegCycle(4, new int[]{0,1,2}, new int[]{1,2,3}, new long[]{1,1,1})) throw new AssertionError();
    }
}
