package com.igorkan.modules.vose_alias_sampler_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        Types.AliasTable t = Core.build(new double[]{1.0, 3.0});
        int c0 = 0, c1 = 0;
        for (int b = 0; b < 2; b++) for (int k = 0; k < 4; k++) {
            int s = c.sample(t, b, (k + 0.5) / 4.0);
            if (s == 0) c0++; else c1++;
        }
        if (c0 != 2 || c1 != 6) throw new AssertionError("expected 2:6 ratio, got " + c0 + ":" + c1);
        Invariants.ensure(true, "unit ok");
    }
}
