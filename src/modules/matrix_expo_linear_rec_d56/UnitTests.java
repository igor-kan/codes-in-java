package com.igorkan.modules.matrix_expo_linear_rec_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.fibMod(0) != 0 || c.fibMod(10) != 55 || c.fibMod(50) != 586268941L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
