package com.igorkan.modules.persistent_treap_rope_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Types.Node r = Core.make(7L, 1, null, null);
        if (new Core().sumOf(r) != 7L) throw new AssertionError();
    }
}
