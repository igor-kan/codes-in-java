package com.igorkan.modules.segment_tree_rmq;

public final class Invariants {
    private Invariants() {}

    public static void verifyMatchesBrute(Core seg, long[] ref, int l, int r) {
        long brute = Long.MAX_VALUE;
        for (int i = l; i <= r; i++) brute = Math.min(brute, ref[i]);
        Errors.require(seg.rangeMin(l, r) == brute, "segment tree RMQ mismatch");
    }
}
