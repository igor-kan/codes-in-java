package com.igorkan.modules.kosaraju_scc_count_d56;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int countScc(int n, int[] u, int[] v) {
        List<List<Integer>> g = new ArrayList<>();
        List<List<Integer>> rg = new ArrayList<>();
        for (int i = 0; i < n; i++) { g.add(new ArrayList<>()); rg.add(new ArrayList<>()); }
        for (int i = 0; i < u.length; i++) { g.get(u[i]).add(v[i]); rg.get(v[i]).add(u[i]); }
        boolean[] vis = new boolean[n];
        List<Integer> order = new ArrayList<>();
        Deque<int[]> stk = new ArrayDeque<>();
        for (int s = 0; s < n; s++) {
            if (vis[s]) continue;
            stk.push(new int[]{s, 0});
            vis[s] = true;
            while (!stk.isEmpty()) {
                int[] top = stk.peek();
                int cur = top[0];
                if (top[1] < g.get(cur).size()) {
                    int nxt = g.get(cur).get(top[1]++);
                    if (!vis[nxt]) { vis[nxt] = true; stk.push(new int[]{nxt, 0}); }
                } else {
                    stk.pop();
                    order.add(cur);
                }
            }
        }
        Arrays.fill(vis, false);
        int scc = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = order.size() - 1; i >= 0; i--) {
            int s = order.get(i);
            if (vis[s]) continue;
            scc++;
            vis[s] = true;
            q.push(s);
            while (!q.isEmpty()) {
                int cur = q.pop();
                for (int nxt : rg.get(cur)) {
                    if (!vis[nxt]) { vis[nxt] = true; q.push(nxt); }
                }
            }
        }
        return scc;
    }
}
