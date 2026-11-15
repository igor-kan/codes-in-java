package com.igorkan.modules.segment_tree_rmq;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        int n = 40;
        long[] ref = new long[n];
        for (int i = 0; i < n; i++) ref[i] = i - 10;
        Core seg = new Core(ref);
        for (int step = 0; step < 60; step++) {
            int l = (step * 7) % 25;
            int r = l + ((step * 3) % (n - l));
            long d = (step % 9) - 4;
            seg.rangeAdd(l, r, d);
            for (int i = l; i <= r; i++) ref[i] += d;
            Invariants.verifyMatchesBrute(seg, ref, 0, n - 1);
            Invariants.verifyMatchesBrute(seg, ref, l, r);
        }
    }
}
