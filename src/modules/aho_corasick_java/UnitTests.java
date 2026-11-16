package com.igorkan.modules.aho_corasick_java;

import java.util.List;

public final class UnitTests {
    public static void main(String[] args) {
        Core ac = new Core(List.of("he", "she", "his", "hers"));
        Invariants.verifyOracle(ac, "ushers");
        if (FastPath.countMatches(ac, "ushers") != 3) throw new AssertionError("expected 3 matches");
    }
}
