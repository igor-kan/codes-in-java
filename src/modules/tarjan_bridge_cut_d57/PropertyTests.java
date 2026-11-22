package com.igorkan.modules.tarjan_bridge_cut_d57;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] cyc = c.articulationPoints(4, new int[]{0, 1, 2, 3}, new int[]{1, 2, 3, 0});
        if (cyc.length != 0) throw new AssertionError();
    }
}
