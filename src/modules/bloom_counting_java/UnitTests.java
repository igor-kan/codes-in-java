package com.igorkan.modules.bloom_counting_java;

public final class UnitTests {
    public static void main(String[] args) {
        Core bf = new Core(512, 4);
        long[] live = new long[50];
        for (int i = 0; i < 50; i++) { live[i] = 1000L + i * 7L; bf.add(live[i]); }
        Invariants.verifyAllPresent(bf, live);
        if (!bf.remove(1000L + 10 * 7L)) throw new AssertionError("expected removal");
        if (bf.mayContain(1000L + 10 * 7L)) throw new AssertionError("expected deleted key absent");
        if (!bf.mayContain(1000L + 11 * 7L)) throw new AssertionError("neighbor impacted by delete");
    }
}
