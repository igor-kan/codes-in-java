package com.igorkan.modules.trie_radix_compact_d60;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core t = new Core();
        t.addWord("algo"); t.addWord("algorithm"); t.addWord("alpha");
        if (t.countWithPrefix("alg") != 2 || !t.longestMatchPrefix("algorithms").equals("algorithm")) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
