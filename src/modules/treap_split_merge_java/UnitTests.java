package com.igorkan.modules.treap_split_merge_java;

import java.util.List;

public final class UnitTests {
    public static void main(String[] args) {
        Core t = new Core();
        for (int k : new int[]{40, 10, 30, 50, 20, 60}) t.insert(k);
        Invariants.verifyTreap(t.rootNode());
        if (t.kthSmallest(0) != 10 || t.kthSmallest(3) != 40) throw new AssertionError("rank mismatch");
        t.erase(30);
        Invariants.verifyTreap(t.rootNode());
        if (!FastPath.toSortedList(t).equals(List.of(10, 20, 40, 50, 60))) {
            throw new AssertionError("sorted list mismatch");
        }
    }
}
