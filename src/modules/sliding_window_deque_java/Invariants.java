package com.igorkan.modules.sliding_window_deque_java;

public final class Invariants {
    public static void verifyMatchesBrute(int[] arr, int k, Types.WindowExtrema got) {
        for (int i = 0; i <= arr.length - k; i++) {
            int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                mn = Math.min(mn, arr[i + j]);
                mx = Math.max(mx, arr[i + j]);
            }
            if (got.mins()[i] != mn || got.maxs()[i] != mx) {
                throw new AssertionError("window mismatch at " + i);
            }
        }
    }
}
