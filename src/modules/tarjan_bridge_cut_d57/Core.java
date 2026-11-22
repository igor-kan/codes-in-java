package com.igorkan.modules.tarjan_bridge_cut_d57;

import java.util.*;

public final class Core implements Contract {
    private int timer;

    private void dfs(int u, int p, List<List<Integer>> g, boolean[] vis, int[] tin, int[] low, boolean[] isCut) {
        vis[u] = true;
        tin[u] = low[u] = timer++;
        int children = 0;
        for (int to : g.get(u)) {
            if (to == p) continue;
            if (vis[to]) {
                low[u] = Math.min(low[u], tin[to]);
            } else {
                dfs(to, u, g, vis, tin, low, isCut);
                low[u] = Math.min(low[u], low[to]);
                if (low[to] >= tin[u] && p != -1) isCut[u] = true;
                children++;
            }
        }
        if (p == -1 && children > 1) isCut[u] = true;
    }

    @Override
    public int[] articulationPoints(int n, int[] u, int[] v) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int i = 0; i < u.length; i++) { g.get(u[i]).add(v[i]); g.get(v[i]).add(u[i]); }
        boolean[] vis = new boolean[n];
        boolean[] isCut = new boolean[n];
        int[] tin = new int[n], low = new int[n];
        timer = 0;
        for (int i = 0; i < n; i++) if (!vis[i]) dfs(i, -1, g, vis, tin, low, isCut);
        int cnt = 0;
        for (boolean b : isCut) if (b) cnt++;
        int[] res = new int[cnt];
        int idx = 0;
        for (int i = 0; i < n; i++) if (isCut[i]) res[idx++] = i;
        return res;
    }
}
