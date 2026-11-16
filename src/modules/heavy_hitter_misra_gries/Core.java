package com.igorkan.modules.heavy_hitter_misra_gries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Core implements Contract {
    public final int k;
    public long streamN = 0L;
    public final Map<Long, Long> counters = new HashMap<>();

    public Core(int k) {
        Validation.validateK(k);
        this.k = k;
    }

    private void pruneDrop(long delta) {
        Iterator<Map.Entry<Long, Long>> it = counters.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Long> e = it.next();
            long nxt = e.getValue() - delta;
            if (nxt <= 0L) it.remove();
            else e.setValue(nxt);
        }
    }

    @Override
    public void observe(long item) {
        streamN++;
        Long cur = counters.get(item);
        if (cur != null) {
            counters.put(item, cur + 1L);
            return;
        }
        if (counters.size() < k - 1) {
            counters.put(item, 1L);
        } else {
            pruneDrop(1L);
        }
    }

    @Override
    public List<Long> candidatesExceedingThreshold() {
        return new ArrayList<>(counters.keySet());
    }

    @Override
    public void merge(Core other) {
        Errors.require(other.k == this.k, "k mismatch on merge");
        for (Map.Entry<Long, Long> e : other.counters.entrySet()) {
            counters.merge(e.getKey(), e.getValue(), Long::sum);
        }
        streamN += other.streamN;
        while (counters.size() >= k) {
            long minVal = Long.MAX_VALUE;
            for (long v : counters.values()) if (v < minVal) minVal = v;
            pruneDrop(minVal);
        }
    }
}
