package com.igorkan.modules.lru_ordered_java_d59;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core(); c.init(3);
        for (int i = 0; i < 20; i++) c.put(i % 7, i);
        if (c.size() > 3) throw new AssertionError();
    }
}
