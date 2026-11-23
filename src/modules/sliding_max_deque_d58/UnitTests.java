package com.igorkan.modules.sliding_max_deque_d58;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] got = c.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        if (!Arrays.equals(got, new int[]{3, 3, 5, 5, 6, 7})) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
