package com.igorkan.modules.dinic_maxflow_scaling_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.maxFlow(3, 0, 2, List.of(new Types.EdgeSpec(0, 1, 9), new Types.EdgeSpec(1, 2, 4))) != 4L) throw new AssertionError();
    }
}
