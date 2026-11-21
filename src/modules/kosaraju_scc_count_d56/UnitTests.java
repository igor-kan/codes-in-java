package com.igorkan.modules.kosaraju_scc_count_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int scc = c.countScc(5, new int[]{1, 0, 2, 0, 3}, new int[]{0, 2, 1, 3, 4});
        if (scc != 3) throw new AssertionError("expected 3, got " + scc);
        Invariants.ensure(true, "unit ok");
    }
}
