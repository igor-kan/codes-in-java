package com.igorkan.modules.edit_dist_lev_d58;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.editDistance("horse", "ros") != 3 || c.editDistance("intention", "execution") != 5) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
