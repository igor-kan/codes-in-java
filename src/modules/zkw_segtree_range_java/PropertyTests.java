package com.igorkan.modules.zkw_segtree_range_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        if (new Core().rangeSum(4, new long[]{7,0,0,5}, 0, 3) != 12L) throw new AssertionError();
    }
}
