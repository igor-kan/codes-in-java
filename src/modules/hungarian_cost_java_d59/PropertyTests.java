package com.igorkan.modules.hungarian_cost_java_d59;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[][] m = {{10, 19, 8}, {10, 18, 7}, {13, 16, 9}};
        if (c.minAssignmentCost(m) != 33) throw new AssertionError();
    }
}
