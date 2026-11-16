package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.List;

public final class Invariants {
    private Invariants() {}

    public static void verifyDisjointAndMass(Core tree) {
        List<Types.Interval> snap = tree.snapshot();
        long sum = 0L;
        for (int i = 0; i < snap.size(); i++) {
            Types.Interval cur = snap.get(i);
            if (cur.lo() > cur.hi()) throw new Errors.IntervalException("inverted interval");
            sum += ((long) cur.hi() - cur.lo() + 1L);
            if (i > 0 && (long) snap.get(i - 1).hi() + 1L >= (long) cur.lo()) {
                throw new Errors.IntervalException("non-disjoint or uncoalesced intervals");
            }
        }
        if (sum != tree.coveredPoints()) throw new Errors.IntervalException("coveredPoints drift");
    }
}
