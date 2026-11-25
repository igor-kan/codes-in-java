package com.igorkan.modules.trie_radix_compact_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core t = new Core();
        t.addWord("a"); t.addWord("ab"); t.addWord("abc");
        if (t.countWithPrefix("a") != 3 || t.countWithPrefix("z") != 0) throw new AssertionError();
    }
}
