package com.igorkan.modules.sliding_max_deque_d58;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] got = c.maxSlidingWindow(new int[]{9, 7, 5, 3}, 2);
        if (!Arrays.equals(got, new int[]{9, 7, 5})) throw new AssertionError();
    }
}
