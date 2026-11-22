package com.igorkan.modules.fenwick_point_range_d57;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core fw = new Core();
        fw.init(4);
        long exp = 0;
        for (int i = 0; i < 4; i++) { fw.add(i, i + 1); exp += i + 1; }
        if (fw.rangeSum(0, 3) != exp) throw new AssertionError();
    }
}
