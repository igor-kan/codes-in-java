package com.igorkan.modules.bipartite_check_java_d59;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (!c.isBipartite(4, new int[]{0}, new int[]{1})) throw new AssertionError();
    }
}
