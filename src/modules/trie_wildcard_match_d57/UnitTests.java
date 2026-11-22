package com.igorkan.modules.trie_wildcard_match_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core tr = new Core();
        tr.addWord("bad"); tr.addWord("dad"); tr.addWord("mad");
        if (!tr.search(".ad") || !tr.search("b..") || tr.search("pad")) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
