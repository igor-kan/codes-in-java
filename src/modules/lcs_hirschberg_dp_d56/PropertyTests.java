package com.igorkan.modules.lcs_hirschberg_dp_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] a = {10, 20, 30, 40};
        int[] b = {40, 20, 10, 30};
        if (c.lcsLength(a, b) != c.lcsLength(b, a)) throw new AssertionError();
    }
}
