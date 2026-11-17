package com.igorkan.modules.sliding_window_deque_java;

public final class UnitTests {
    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        var ex = new Core().compute(a, 3);
        Invariants.verifyMatchesBrute(a, 3, ex);
    }
}
