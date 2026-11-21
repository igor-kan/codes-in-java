package com.igorkan.modules.kahn_topological_lex_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] cyc = c.lexTopoSort(2, new int[]{0, 1}, new int[]{1, 0});
        if (cyc.length != 0) throw new AssertionError("cycle missed");
    }
}
