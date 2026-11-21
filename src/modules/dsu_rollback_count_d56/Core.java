package com.igorkan.modules.dsu_rollback_count_d56;

import java.util.*;

public final class Core implements Contract {
    private int[] parent;
    private int[] size;
    private int comps;
    private final Deque<int[]> history = new ArrayDeque<>();

    public void init(int n) {
        parent = new int[n];
        size = new int[n];
        comps = n;
        history.clear();
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }

    public int find(int x) {
        while (parent[x] != x) x = parent[x];
        return x;
    }

    public int snapshot() { return history.size(); }

    public void union(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra == rb) return;
        if (size[ra] < size[rb]) { int t = ra; ra = rb; rb = t; }
        history.push(new int[]{rb, ra, size[ra]});
        parent[rb] = ra;
        size[ra] += size[rb];
        comps--;
    }

    public void rollback(int snap) {
        while (history.size() > snap) {
            int[] rec = history.pop();
            parent[rec[0]] = rec[0];
            size[rec[1]] = rec[2];
            comps++;
        }
    }

    @Override
    public int components() { return comps; }
}
