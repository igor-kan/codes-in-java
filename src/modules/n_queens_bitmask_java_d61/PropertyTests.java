package com.igorkan.modules.n_queens_bitmask_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        long[] expected = {1L, 0L, 0L, 2L, 10L, 4L, 40L, 92L, 352L, 724L};
        for (int n = 1; n <= expected.length; ++n) {
            if (c.countSolutions(n) != expected[n - 1]) throw new AssertionError("count mismatch at n=" + n);
        }
        if (c.firstSolution(1).length != 1) throw new AssertionError("trivial first");
        if (c.firstSolution(2).length != 0) throw new AssertionError("no solution n=2");
        if (c.firstSolution(3).length != 0) throw new AssertionError("no solution n=3");
    }
}
