package com.igorkan.modules.dijkstra_pq_graph_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long[] d = c.shortestPaths(4, 0, new int[]{0, 0, 2, 1}, new int[]{1, 2, 1, 3}, new long[]{5, 1, 2, 2});
        if (d[0] != 0 || d[1] != 3 || d[3] != 5) throw new AssertionError("bad sp");
        Invariants.ensure(true, "unit ok");
    }
}
