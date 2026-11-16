package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.List;

public interface Contract {
    void observe(long item);
    List<Long> candidatesExceedingThreshold();
    void merge(Core other);
}
