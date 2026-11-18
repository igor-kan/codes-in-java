package com.igorkan.modules.dinic_maxflow_scaling_java;

import java.util.*;

public final class Core implements Contract {
    private static final class Edge {
        final int to, rev;
        long cap;
        Edge(int to, int rev, long cap) { this.to = to; this.rev = rev; this.cap = cap; }
    }
    @Override
    public long maxFlow(int n, int s, int t, List<Types.EdgeSpec> edges) {
        List<List<Edge>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (var e : edges) {
            adj.get(e.u()).add(new Edge(e.v(), adj.get(e.v()).size(), e.cap()));
            adj.get(e.v()).add(new Edge(e.u(), adj.get(e.u()).size() - 1, 0));
        }
        int[] level = new int[n];
        int[] ptr = new int[n];
        long flow = 0;
        while (true) {
            Arrays.fill(level, -1);
            level[s] = 0;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(s);
            while (!q.isEmpty()) {
                int u = q.poll();
                for (Edge e : adj.get(u)) {
                    if (e.cap > 0 && level[e.to] < 0) {
                        level[e.to] = level[u] + 1;
                        q.add(e.to);
                    }
                }
            }
            if (level[t] < 0) break;
            Arrays.fill(ptr, 0);
            long pushed;
            while ((pushed = dfs(s, t, Long.MAX_VALUE / 4, adj, level, ptr)) > 0) {
                flow += pushed;
            }
        }
        return flow;
    }
    private long dfs(int u, int t, long pushed, List<List<Edge>> adj, int[] level, int[] ptr) {
        if (pushed == 0 || u == t) return pushed;
        List<Edge> list = adj.get(u);
        for (; ptr[u] < list.size(); ptr[u]++) {
            Edge e = list.get(ptr[u]);
            if (level[e.to] != level[u] + 1 || e.cap <= 0) continue;
            long tr = dfs(e.to, t, Math.min(pushed, e.cap), adj, level, ptr);
            if (tr == 0) continue;
            e.cap -= tr;
            adj.get(e.to).get(e.rev).cap += tr;
            return tr;
        }
        return 0;
    }
}
