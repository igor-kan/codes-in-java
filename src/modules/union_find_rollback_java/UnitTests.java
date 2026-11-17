package com.igorkan.modules.union_find_rollback_java;

public final class UnitTests {
    public static void main(String[] args) {
        Core dsu = new Core(6);
        dsu.unite(0, 1);
        dsu.unite(2, 3);
        int snap = dsu.snapshot();
        dsu.unite(0, 2);
        dsu.unite(4, 5);
        Invariants.verifyMassConservation(dsu);
        if (dsu.components() != 2) throw new AssertionError("expected 2 components");
        dsu.rollback(snap);
        Invariants.verifyMassConservation(dsu);
        if (dsu.components() != 4 || dsu.find(0) == dsu.find(2)) {
            throw new AssertionError("rollback failed to split components");
        }
    }
}
