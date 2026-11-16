package com.igorkan.modules.count_min_sketch_java;

import java.util.HashMap;
import java.util.Map;

public final class UnitTests {
    public static void main(String[] args) {
        Core cms = new Core(Validation.createValidated(128, 5, 42L));
        Map<Long, Long> exact = new HashMap<>();
        for (long i = 0; i < 400; i++) {
            long k = i % 37;
            cms.increment(k, 1L);
            exact.merge(k, 1L, Long::sum);
        }
        Invariants.verifyNoUnderestimation(cms, exact);
        if (cms.table.mass != 400L) throw new AssertionError("mass mismatch");
    }
}
