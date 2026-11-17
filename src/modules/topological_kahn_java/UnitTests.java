package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class UnitTests {
    public static void main(String[] args) {
        Core engine = new Core();
        List<int[]> edges = List.of(new int[]{5, 2}, new int[]{5, 0}, new int[]{4, 0}, new int[]{4, 1}, new int[]{2, 3}, new int[]{3, 1});
        var res = engine.sortDag(6, edges);
        Invariants.verifyTopo(6, edges, res);
        if (!res.order().equals(List.of(4, 5, 0, 2, 3, 1))) {
            throw new AssertionError("expected lexicographical order [4,5,0,2,3,1], got " + res.order());
        }
        if (res.longestPathLen() != 3) throw new AssertionError("expected longest path 3");
    }
}
