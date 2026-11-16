package com.igorkan.modules.count_min_sketch_java;

import java.util.Map;

public final class Invariants {
    private Invariants() {}

    public static void verifyNoUnderestimation(Core cms, Map<Long, Long> exact) {
        for (Map.Entry<Long, Long> e : exact.entrySet()) {
            long est = cms.query(e.getKey());
            if (est < e.getValue()) {
                throw new Errors.CmsException("underestimation at key=" + e.getKey() + ": est=" + est + " exact=" + e.getValue());
            }
        }
    }
}
