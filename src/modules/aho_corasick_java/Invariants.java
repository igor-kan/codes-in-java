package com.igorkan.modules.aho_corasick_java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Invariants {
    private Invariants() {}

    public static void verifyOracle(Core ac, String text) {
        Set<Types.Match> got = new HashSet<>(ac.findAll(text));
        Set<Types.Match> expected = new HashSet<>();
        for (int pid = 0; pid < ac.patterns.size(); pid++) {
            String pat = ac.patterns.get(pid);
            int idx = text.indexOf(pat);
            while (idx >= 0) {
                expected.add(new Types.Match(idx, pid));
                idx = text.indexOf(pat, idx + 1);
            }
        }
        if (!got.equals(expected)) {
            throw new Errors.AcJavaException("match set mismatch: got=" + got + " expected=" + expected);
        }
    }
}
