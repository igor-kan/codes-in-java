package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long[] s1 = new long[300];
        long[] s2 = new long[300];
        Map<Long, Long> exact = new HashMap<>();
        for (int i = 0; i < 300; i++) {
            s1[i] = (i % 5 == 0) ? 77L : ((i * 7L) % 50L);
            s2[i] = (i % 4 == 0) ? 77L : ((i * 11L) % 50L);
            exact.merge(s1[i], 1L, Long::sum);
            exact.merge(s2[i], 1L, Long::sum);
        }
        Core merged = Concurrent.parallelSummary(6, List.of(s1, s2));
        Invariants.verifyHeavyHittersCaptured(merged, exact);
    }
}
