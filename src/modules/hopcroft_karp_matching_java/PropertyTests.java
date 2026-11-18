package com.igorkan.modules.hopcroft_karp_matching_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.maxMatching(3, 2, new int[][]{{0,0},{1,0},{2,1}}).cardinality() != 2) throw new AssertionError();
    }
}
