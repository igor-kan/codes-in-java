package com.igorkan.modules.binary_lifting_lca_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public Types.LcaTable build(int[] parent) {
        int n = parent.length;
        if (n == 0) {
            return new Types.LcaTable(new int[0], new int[0][]);
        }
        int root = 0;
        for (int v = 0; v < n; ++v) {
            if (parent[v] == v) {
                root = v;
                break;
            }
        }
        int[] depth = new int[n];
        List<List<Integer>> children = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            children.add(new ArrayList<>());
        }
        for (int v = 0; v < n; ++v) {
            if (parent[v] != v && parent[v] >= 0 && parent[v] < n) {
                children.get(parent[v]).add(v);
            }
        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int c : children.get(u)) {
                depth[c] = depth[u] + 1;
                stack.push(c);
            }
        }
        int log = 1;
        while ((1 << log) <= n) {
            ++log;
        }
        int[][] up = new int[log][n];
        for (int v = 0; v < n; ++v) {
            up[0][v] = Math.max(0, Math.min(n - 1, parent[v]));
        }
        for (int k = 1; k < log; ++k) {
            for (int v = 0; v < n; ++v) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }
        return new Types.LcaTable(depth, up);
    }

    @Override
    public int lca(Types.LcaTable table, int a, int b) {
        int[] depth = table.depth();
        int[][] up = table.up();
        int x = a;
        int y = b;
        if (depth[x] < depth[y]) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        int diff = depth[x] - depth[y];
        for (int k = 0; k < up.length; ++k) {
            if (((diff >> k) & 1) == 1) {
                x = up[k][x];
            }
        }
        if (x == y) {
            return x;
        }
        for (int k = up.length - 1; k >= 0; --k) {
            if (up[k][x] != up[k][y]) {
                x = up[k][x];
                y = up[k][y];
            }
        }
        return up[0][x];
    }
}
