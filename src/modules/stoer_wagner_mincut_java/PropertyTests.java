package com.igorkan.modules.stoer_wagner_mincut_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        long[][] g = {{0,10,0},{10,0,2},{0,2,0}}; if (new Core().globalMinCut(g).minCut() != 2L) throw new AssertionError();
    }
}
