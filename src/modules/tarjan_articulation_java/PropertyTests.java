package com.igorkan.modules.tarjan_articulation_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        if (new Core().analyze(3, new int[][]{{0,1},{1,2},{2,0}}).bridges() != 0) throw new AssertionError();
    }
}
