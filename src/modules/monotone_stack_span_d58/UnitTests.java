package com.igorkan.modules.monotone_stack_span_d58;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] sp = c.backwardSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        if (!Arrays.equals(sp, new int[]{1, 1, 1, 2, 1, 4, 6})) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
