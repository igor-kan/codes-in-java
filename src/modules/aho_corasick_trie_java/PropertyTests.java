package com.igorkan.modules.aho_corasick_trie_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.countMatches(List.of("ab", "aba", "ba"), "ababa").totalHits() != 6L) throw new AssertionError();
    }
}
