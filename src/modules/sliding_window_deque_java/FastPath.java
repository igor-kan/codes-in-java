package com.igorkan.modules.sliding_window_deque_java;

public final class FastPath {
    public static long rangeSpreadSum(Types.WindowExtrema ex) {
        long s = 0;
        for (int i = 0; i < ex.maxs().length; i++) s += (long) ex.maxs()[i] - ex.mins()[i];
        return s;
    }
}
