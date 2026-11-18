package com.igorkan.modules.hopcroft_karp_matching_java;

import java.util.*;

public final class Core implements Contract {
    @Override
    public Types.MatchResult maxMatching(int nLeft, int nRight, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>(nLeft);
        for (int i = 0; i < nLeft; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) adj.get(e[0]).add(e[1]);
        int[] pairU = new int[nLeft], pairV = new int[nRight], dist = new int[nLeft];
        Arrays.fill(pairU, -1); Arrays.fill(pairV, -1);
        int matching = 0;
        while (bfs(nLeft, adj, pairU, pairV, dist)) {
            for (int u = 0; u < nLeft; u++) {
                if (pairU[u] == -1 && dfs(u, adj, pairU, pairV, dist)) matching++;
            }
        }
        return new Types.MatchResult(matching, pairU);
    }
    private boolean bfs(int nLeft, List<List<Integer>> adj, int[] pairU, int[] pairV, int[] dist) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int u = 0; u < nLeft; u++) {
            if (pairU[u] == -1) { dist[u] = 0; q.add(u); }
            else dist[u] = Integer.MAX_VALUE;
        }
        boolean found = false;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                int u2 = pairV[v];
                if (u2 == -1) found = true;
                else if (dist[u2] == Integer.MAX_VALUE) { dist[u2] = dist[u] + 1; q.add(u2); }
            }
        }
        return found;
    }
    private boolean dfs(int u, List<List<Integer>> adj, int[] pairU, int[] pairV, int[] dist) {
        for (int v : adj.get(u)) {
            int u2 = pairV[v];
            if (u2 == -1 || (dist[u2] == dist[u] + 1 && dfs(u2, adj, pairU, pairV, dist))) {
                pairU[u] = v; pairV[v] = u; return true;
            }
        }
        dist[u] = Integer.MAX_VALUE;
        return false;
    }
}
