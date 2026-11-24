package com.igorkan.modules.rabin_karp_java_d59;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        String s = "java_rolling_hash_match", p = "hash";
        if (c.indexOfRolling(s, p) != s.indexOf(p)) throw new AssertionError();
    }
}
