package com.igorkan.modules.interval_coalesce_tree_java;

public final class UnitTests {
    public static void main(String[] args) {
        Core t = new Core();
        t.addRange(1, 5);
        t.addRange(8, 10);
        t.addRange(6, 7); // bridges [1,5] and [8,10] into [1,10]
        if (t.coveredPoints() != 10L || t.snapshot().size() != 1) throw new AssertionError("merge failed");
        if (!t.contains(6) || t.contains(11)) throw new AssertionError("contains failed");
        Invariants.verifyDisjointAndMass(t);
    }
}
