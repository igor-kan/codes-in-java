package com.igorkan.modules.word_break_trie_dp_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.minWordSegments("catsanddog", new String[]{"cat", "cats", "and", "sand", "dog"}) != 3) throw new AssertionError();
        if (c.minWordSegments("catsandog", new String[]{"cats", "dog", "sand", "and", "cat"}) != -1) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
