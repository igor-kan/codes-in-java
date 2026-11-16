package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.HashMap;
import java.util.Map;

public final class UnitTests {
    public static void main(String[] args) {
        Core mg = new Core(4); // threshold N/4 = 25%
        Map<Long, Long> exact = new HashMap<>();
        for (int i = 0; i < 400; i++) {
            long x = (i % 3 == 0) ? 999L : (i % 40);
            mg.observe(x);
            exact.merge(x, 1L, Long::sum);
        }
        Invariants.verifyHeavyHittersCaptured(mg, exact);
        if (!mg.counters.containsKey(999L)) throw new AssertionError("missed 33% heavy hitter 999");
    }
}
