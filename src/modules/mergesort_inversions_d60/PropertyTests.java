package com.igorkan.modules.mergesort_inversions_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] rev = {5, 4, 3, 2, 1};
        if (c.countInversions(rev) != 10L) throw new AssertionError();
    }
}
