package com.igorkan.modules.boruvka_mst_java_d61;

import java.util.*;

public final class Core implements Contract {
    private static final class DisjointSet {
        private final int[] parent;
        private final int[] size;

        DisjointSet(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; ++i) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        boolean union(int a, int b) {
            int ra = find(a);
            int rb = find(b);
            if (ra == rb) {
                return false;
            }
            if (size[ra] < size[rb]) {
                int tmp = ra;
                ra = rb;
                rb = tmp;
            }
            parent[rb] = ra;
            size[ra] += size[rb];
            return true;
        }
    }

    @Override
    public Types.MstSummary minimumSpanningTree(int n, Types.WeightedEdge[] edges) {
        if (n <= 0) {
            return new Types.MstSummary(0L, 0);
        }
        DisjointSet dsu = new DisjointSet(n);
        long total = 0L;
        int used = 0;
        while (true) {
            int[] best = new int[n];
            Arrays.fill(best, -1);
            for (int idx = 0; idx < edges.length; ++idx) {
                Types.WeightedEdge e = edges[idx];
                if (e.u() < 0 || e.u() >= n || e.v() < 0 || e.v() >= n) {
                    continue;
                }
                int ru = dsu.find(e.u());
                int rv = dsu.find(e.v());
                if (ru == rv) {
                    continue;
                }
                if (best[ru] == -1 || e.w() < edges[best[ru]].w()) {
                    best[ru] = idx;
                }
                if (best[rv] == -1 || e.w() < edges[best[rv]].w()) {
                    best[rv] = idx;
                }
            }
            boolean merged = false;
            for (int v = 0; v < n; ++v) {
                int idx = best[v];
                if (idx == -1) {
                    continue;
                }
                Types.WeightedEdge e = edges[idx];
                if (dsu.union(e.u(), e.v())) {
                    total += e.w();
                    ++used;
                    merged = true;
                }
            }
            if (!merged) {
                break;
            }
        }
        return new Types.MstSummary(total, used);
    }
}
