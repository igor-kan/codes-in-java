package com.igorkan.modules.trie_wildcard_match_d57;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core tr = new Core();
        tr.addWord("java");
        if (!tr.search("j.v.") || tr.search("j..")) throw new AssertionError();
    }
}
