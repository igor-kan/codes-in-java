package com.igorkan.modules.boruvka_mst_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        Types.WeightedEdge[] edges = {
            new Types.WeightedEdge(0, 1, 4L),
            new Types.WeightedEdge(0, 2, 3L),
            new Types.WeightedEdge(1, 2, 1L),
            new Types.WeightedEdge(1, 3, 2L),
            new Types.WeightedEdge(2, 3, 5L)
        };
        Types.MstSummary summary = c.minimumSpanningTree(4, edges);
        if (summary.weight() != 6L || summary.edges() != 3) throw new AssertionError("mst");
        Types.WeightedEdge[] forest = {
            new Types.WeightedEdge(0, 1, 3L),
            new Types.WeightedEdge(2, 3, 4L)
        };
        Types.MstSummary sparse = c.minimumSpanningTree(4, forest);
        if (sparse.weight() != 7L || sparse.edges() != 2) throw new AssertionError("forest");
        Types.MstSummary single = c.minimumSpanningTree(1, new Types.WeightedEdge[0]);
        if (single.weight() != 0L || single.edges() != 0) throw new AssertionError("single");
        Invariants.ensure(true, "unit ok");
    }
}
