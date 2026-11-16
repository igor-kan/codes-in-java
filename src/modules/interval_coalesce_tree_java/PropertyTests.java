package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        List<Types.Interval> s1 = new ArrayList<>();
        List<Types.Interval> s2 = new ArrayList<>();
        BitSet oracle = new BitSet(500);
        for (int i = 0; i < 60; i++) {
            int lo = (i * 19) % 400;
            int hi = lo + ((i * 7) % 15);
            Types.Interval iv = new Types.Interval(lo, hi);
            if (i % 2 == 0) s1.add(iv); else s2.add(iv);
            oracle.set(lo, hi + 1);
        }
        Core tree = Concurrent.parallelReduceUnion(List.of(s1, s2));
        Invariants.verifyDisjointAndMass(tree);
        if (tree.coveredPoints() != oracle.cardinality()) throw new AssertionError("cardinality mismatch");
        for (int p = 0; p < 450; p++) {
            if (tree.contains(p) != oracle.get(p)) throw new AssertionError("point mismatch at " + p);
        }
    }
}
