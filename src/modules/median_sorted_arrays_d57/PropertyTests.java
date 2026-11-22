package com.igorkan.modules.median_sorted_arrays_d57;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        double m1 = c.findMedianSorted(new int[]{5, 9, 15}, new int[]{1, 8});
        double m2 = c.findMedianSorted(new int[]{1, 8}, new int[]{5, 9, 15});
        if (Math.abs(m1 - m2) > 1e-9 || Math.abs(m1 - 8.0) > 1e-9) throw new AssertionError();
    }
}
