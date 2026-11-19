package com.igorkan.modules.fenwick_inversion_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        if (new Core().countInversions(new int[]{5, 4, 3, 2, 1}) != 10L) throw new AssertionError();
    }
}
