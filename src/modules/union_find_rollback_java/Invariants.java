package com.igorkan.modules.union_find_rollback_java;

import java.util.HashSet;
import java.util.Set;

public final class Invariants {
    public static void verifyMassConservation(Core dsu) {
        Set<Integer> roots = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < dsu.vertexCount(); i++) {
            int r = dsu.find(i);
            if (roots.add(r)) sum += dsu.componentSize(r);
        }
        if (roots.size() != dsu.components() || sum != dsu.vertexCount()) {
            throw new AssertionError("DSU mass invariant violated");
        }
    }
}
