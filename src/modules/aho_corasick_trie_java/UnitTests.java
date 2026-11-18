package com.igorkan.modules.aho_corasick_trie_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        var st = c.countMatches(List.of("he", "she", "his", "hers"), "ushers");
        if (st.totalHits() != 3L) throw new AssertionError("expected 3 hits, got " + st.totalHits());
        Invariants.ensure(true, "unit ok");
    }
}
