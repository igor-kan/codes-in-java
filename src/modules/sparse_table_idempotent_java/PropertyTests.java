package com.igorkan.modules.sparse_table_idempotent_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        var s = c.queryRange(new long[]{15, 25, 35}, 0, 2);
        if (s.gcdVal() != 5L) throw new AssertionError();
    }
}
