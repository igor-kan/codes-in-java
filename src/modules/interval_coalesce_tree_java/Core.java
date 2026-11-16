package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class Core implements Contract {
    public final TreeMap<Integer, Integer> map = new TreeMap<>();
    private long totalCovered = 0L;

    @Override
    public void addRange(int lo, int hi) {
        Validation.validateRange(lo, hi);
        int curLo = lo;
        int curHi = hi;

        Map.Entry<Integer, Integer> prev = map.floorEntry(lo);
        if (prev != null && (long) prev.getValue() + 1L >= (long) lo) {
            curLo = prev.getKey();
            curHi = Math.max(curHi, prev.getValue());
            totalCovered -= ((long) prev.getValue() - prev.getKey() + 1L);
            map.remove(prev.getKey());
        }

        while (true) {
            Map.Entry<Integer, Integer> next = map.ceilingEntry(curLo);
            if (next == null || (long) next.getKey() > (long) curHi + 1L) break;
            curHi = Math.max(curHi, next.getValue());
            totalCovered -= ((long) next.getValue() - next.getKey() + 1L);
            map.remove(next.getKey());
        }
        map.put(curLo, curHi);
        totalCovered += ((long) curHi - curLo + 1L);
    }

    @Override
    public boolean contains(int point) {
        Map.Entry<Integer, Integer> e = map.floorEntry(point);
        return e != null && point <= e.getValue();
    }

    @Override
    public long coveredPoints() {
        return totalCovered;
    }

    @Override
    public List<Types.Interval> snapshot() {
        List<Types.Interval> res = new ArrayList<>(map.size());
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            res.add(new Types.Interval(e.getKey(), e.getValue()));
        }
        return res;
    }
}
