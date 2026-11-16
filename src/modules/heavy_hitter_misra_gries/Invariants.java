package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.Map;

public final class Invariants {
    private Invariants() {}

    public static void verifyHeavyHittersCaptured(Core mg, Map<Long, Long> exactCounts) {
        long threshold = mg.streamN / mg.k;
        for (Map.Entry<Long, Long> e : exactCounts.entrySet()) {
            if (e.getValue() > threshold && !mg.counters.containsKey(e.getKey())) {
                throw new Errors.MisraGriesException("missed heavy hitter key=" + e.getKey() + " count=" + e.getValue());
            }
        }
        if (mg.counters.size() >= mg.k) {
            throw new Errors.MisraGriesException("counter table exceeded k-1 bound");
        }
    }
}
