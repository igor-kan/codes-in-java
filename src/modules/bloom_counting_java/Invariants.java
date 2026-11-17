package com.igorkan.modules.bloom_counting_java;

public final class Invariants {
    public static void verifyAllPresent(Core bf, long[] liveKeys) {
        for (long k : liveKeys) {
            if (!bf.mayContain(k)) throw new AssertionError("false negative for live key " + k);
        }
    }
}
