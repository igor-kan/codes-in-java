package com.igorkan.modules.bipartite_check_java_d59;

import java.util.*;

public final class Core implements Contract {
    @Override
    public boolean isBipartite(int n, int[] u, int[] v) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < u.length; i++) { adj.get(u[i]).add(v[i]); adj.get(v[i]).add(u[i]); }
        int[] col = new int[n];
        Arrays.fill(col, Types.UNCOLORED);
        Deque<Integer> q = new ArrayDeque<>();
        for (int s = 0; s < n; s++) {
            if (col[s] != Types.UNCOLORED) continue;
            col[s] = 0; q.add(s);
            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int nxt : adj.get(cur)) {
                    if (col[nxt] == Types.UNCOLORED) { col[nxt] = col[cur] ^ 1; q.add(nxt); }
                    else if (col[nxt] == col[cur]) return false;
                }
            }
        }
        return true;
    }
}
