package com.igorkan.modules.word_break_trie_dp_d57;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.minWordSegments("applepenapple", new String[]{"apple", "pen"}) != 3) throw new AssertionError();
    }
}
