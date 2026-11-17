package com.igorkan.modules.treap_split_merge_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        var meds = Concurrent.parallelBatchInsertMedian(List.of(new int[]{5, 1, 9, 3, 7}, new int[]{100, 20, 60}));
        if (!meds.equals(List.of(5, 60))) throw new AssertionError("unexpected medians: " + meds);
    }
}
