package com.igorkan.modules.tarjan_articulation_java;

import java.util.*;

public final class Core implements Contract {
    private int timer, bridges;
    private int[] tin, low;
    private boolean[] art;
    private void dfs(int u, int p, List<List<Integer>> adj) {
        tin[u] = low[u] = timer++;
        int children = 0;
        for (int v : adj.get(u)) {
            if (v == p) continue;
            if (tin[v] != -1) {
                low[u] = Math.min(low[u], tin[v]);
            } else {
                dfs(v, u, adj);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > tin[u]) bridges++;
                if (low[v] >= tin[u] && p != -1) art[u] = true;
                children++;
            }
        }
        if (p == -1 && children > 1) art[u] = true;
    }
    @Override
    public Types.CutReport analyze(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) { adj.get(e[0]).add(e[1]); adj.get(e[1]).add(e[0]); }
        tin = new int[n]; low = new int[n]; art = new boolean[n];
        Arrays.fill(tin, -1); timer = 0; bridges = 0;
        for (int i = 0; i < n; i++) if (tin[i] == -1) dfs(i, -1, adj);
        return new Types.CutReport(art, bridges);
    }
}
