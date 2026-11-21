package com.igorkan.modules.kosaraju_scc_count_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.countScc(3, new int[]{0, 1, 2}, new int[]{1, 2, 0}) != 1) throw new AssertionError();
    }
}
