package com.igorkan.modules.sliding_window_deque_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        int[] a = new int[40], b = new int[40];
        for (int i = 0; i < 40; i++) { a[i] = (i * 13) % 17; b[i] = 100; }
        var sums = Concurrent.parallelSpreadSums(List.of(a, b), 5);
        if (sums.get(0) <= 0 || sums.get(1) != 0) throw new AssertionError("unexpected spreads: " + sums);
    }
}
