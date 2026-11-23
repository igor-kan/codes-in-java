package com.igorkan.modules.monotone_stack_span_d58;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] sp = c.backwardSpans(new int[]{10, 20, 30, 40});
        if (!Arrays.equals(sp, new int[]{1, 2, 3, 4})) throw new AssertionError();
    }
}
