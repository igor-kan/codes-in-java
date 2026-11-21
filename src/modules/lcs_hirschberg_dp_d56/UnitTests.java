package com.igorkan.modules.lcs_hirschberg_dp_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.lcsLength(new int[]{1, 3, 4, 1, 2, 1, 3}, new int[]{3, 4, 1, 2, 3}) != 5) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
