package com.igorkan.modules.dijkstra_pq_graph_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        long[] d = c.shortestPaths(3, 0, new int[]{0, 1}, new int[]{1, 2}, new long[]{4, 6});
        if (d[2] != 10) throw new AssertionError("chain sp failed");
    }
}
