package com.igorkan.modules.aho_corasick_java_d59;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.countMultiHits(new String[]{"ab", "ba"}, "abba") != 2) throw new AssertionError();
    }
}
