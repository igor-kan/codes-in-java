package com.igorkan.modules.red_black_lca_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core t = new Core();
        int[] vals = {50, 20, 70, 10, 30, 60, 80};
        for (int v : vals) t.insert(v);
        if (t.size() != 7 || !t.contains(30) || t.select(0) != 10 || t.select(3) != 50) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
