package com.igorkan.modules.dsu_rollback_count_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core dsu = new Core();
        dsu.init(4);
        dsu.union(0, 3);
        int s = dsu.snapshot();
        dsu.union(1, 2);
        dsu.rollback(s);
        if (dsu.components() != 3) throw new AssertionError();
    }
}
