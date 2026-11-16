package com.igorkan.modules.aho_corasick_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        Core ac = new Core(List.of("a", "ab", "bab", "bc", "bca", "c", "caa"));
        List<String> docs = List.of("abccab", "caababaabcaa", "bbbbcccaa");
        for (String d : docs) Invariants.verifyOracle(ac, d);
        int sum = Concurrent.parallelScanCount(ac, docs);
        if (sum <= 10) throw new AssertionError("unexpected low count");
    }
}
