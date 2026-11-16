package com.igorkan.modules.count_min_sketch_java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long[] s1 = new long[300];
        long[] s2 = new long[300];
        Map<Long, Long> exact = new HashMap<>();
        for (int i = 0; i < 300; i++) {
            s1[i] = (i * 13L) % 53L;
            s2[i] = (i * 29L) % 53L;
            exact.merge(s1[i], 1L, Long::sum);
            exact.merge(s2[i], 1L, Long::sum);
        }
        Types.CmsTable merged = Concurrent.parallelMergeShards(128, 4, 99L, List.of(s1, s2));
        Invariants.verifyNoUnderestimation(new Core(merged), exact);
    }
}
