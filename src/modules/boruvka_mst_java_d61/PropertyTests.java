package com.igorkan.modules.boruvka_mst_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        long state = 0x9e3779b97f4a7c15L;
        for (int trial = 0; trial < 25; ++trial) {
            int n = 2 + trial % 7;
            Types.WeightedEdge[] edges = new Types.WeightedEdge[3 * n];
            for (int k = 0; k < edges.length; ++k) {
                state = state * 6364136223846793005L + 1442695040888963407L;
                int u = Math.floorMod(state, n);
                state = state * 6364136223846793005L + 1442695040888963407L;
                int v = Math.floorMod(state, n);
                state = state * 6364136223846793005L + 1442695040888963407L;
                long w = Math.floorMod(state, 50L) - 10L;
                edges[k] = new Types.WeightedEdge(u, v, w);
            }
            Types.WeightedEdge[] sorted = edges.clone();
            for (int i = 1; i < sorted.length; ++i) {
                for (int j = i; j > 0 && sorted[j].w() < sorted[j - 1].w(); --j) {
                    Types.WeightedEdge tmp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = tmp;
                }
            }
            int[] parent = new int[n];
            for (int i = 0; i < n; ++i) parent[i] = i;
            long wantWeight = 0L;
            int wantEdges = 0;
            for (Types.WeightedEdge e : sorted) {
                int ra = e.u();
                while (parent[ra] != ra) {
                    parent[ra] = parent[parent[ra]];
                    ra = parent[ra];
                }
                int rb = e.v();
                while (parent[rb] != rb) {
                    parent[rb] = parent[parent[rb]];
                    rb = parent[rb];
                }
                if (ra != rb) {
                    parent[ra] = rb;
                    wantWeight += e.w();
                    ++wantEdges;
                }
            }
            Types.MstSummary got = c.minimumSpanningTree(n, edges);
            if (got.weight() != wantWeight || got.edges() != wantEdges) {
                throw new AssertionError("trial " + trial + " mismatch");
            }
            if (got.edges() >= n) throw new AssertionError("too many edges");
        }
    }
}
