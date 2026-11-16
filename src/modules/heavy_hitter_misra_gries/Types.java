package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.Map;

public final class Types {
    private Types() {}

    public record SummaryState(int k, long streamN, Map<Long, Long> counters) {}
}
