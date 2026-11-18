package com.igorkan.modules.dinic_maxflow_scaling_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        long f = c.maxFlow(4, 0, 3, List.of(
            new Types.EdgeSpec(0, 1, 10), new Types.EdgeSpec(0, 2, 10),
            new Types.EdgeSpec(1, 2, 2), new Types.EdgeSpec(1, 3, 8), new Types.EdgeSpec(2, 3, 10)
        ));
        if (f != 18L) throw new AssertionError("expected 18, got " + f);
        Invariants.ensure(true, "unit ok");
    }
}
