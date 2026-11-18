package com.igorkan.modules.edmonds_blossom_lca_java;

import java.util.*;

public final class Core implements Contract {
    private int lca(int n, int a, int b, int[] base, int[] p, int[] match) {
        boolean[] used = new boolean[n];
        while (true) {
            a = base[a]; used[a] = true;
            if (match[a] == -1) break;
            a = p[match[a]];
        }
        while (true) {
            b = base[b];
            if (used[b]) return b;
            b = p[match[b]];
        }
    }
    private void markPath(int v, int b, int children, int[] base, int[] p, int[] match, boolean[] blossom) {
        while (base[v] != b) {
            blossom[base[v]] = blossom[base[match[v]]] = true;
            p[v] = children;
            children = match[v];
            v = p[match[v]];
        }
    }
    @Override
    public Types.GeneralMatch solveGeneralMatching(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) { g.get(e[0]).add(e[1]); g.get(e[1]).add(e[0]); }
        int[] match = new int[n], p = new int[n], base = new int[n];
        Arrays.fill(match, -1);
        for (int root = 0; root < n; root++) {
            if (match[root] != -1) continue;
            boolean[] used = new boolean[n], blossom = new boolean[n];
            Arrays.fill(p, -1);
            for (int i = 0; i < n; i++) base[i] = i;
            used[root] = true;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(root);
            int finish = -1;
            outer: while (!q.isEmpty()) {
                int v = q.poll();
                for (int to : g.get(v)) {
                    if (base[v] == base[to] || match[v] == to) continue;
                    if (to == root || (match[to] != -1 && p[match[to]] != -1)) {
                        int curbase = lca(n, v, to, base, p, match);
                        Arrays.fill(blossom, false);
                        markPath(v, curbase, to, base, p, match, blossom);
                        markPath(to, curbase, v, base, p, match, blossom);
                        for (int i = 0; i < n; i++) {
                            if (blossom[base[i]]) {
                                base[i] = curbase;
                                if (!used[i]) { used[i] = true; q.add(i); }
                            }
                        }
                    } else if (p[to] == -1) {
                        p[to] = v;
                        if (match[to] == -1) { finish = to; break outer; }
                        int m = match[to];
                        used[m] = true; q.add(m);
                    }
                }
            }
            for (int cur = finish; cur != -1;) {
                int pv = p[cur], nxt = match[pv];
                match[cur] = pv; match[pv] = cur;
                cur = nxt;
            }
        }
        int pairs = 0;
        for (int i = 0; i < n; i++) if (match[i] > i) pairs++;
        return new Types.GeneralMatch(pairs, match);
    }
}
