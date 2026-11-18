package com.igorkan.modules.cartesian_rmq_tree_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.queryRmqIndex(new long[]{5, 2, 8, 6}, 0, 3) != 1) throw new AssertionError();
    }
}
