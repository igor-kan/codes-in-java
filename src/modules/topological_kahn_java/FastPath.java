package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class FastPath {
    public static boolean isValidOrder(int n, List<int[]> edges, List<Integer> order) {
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) pos[order.get(i)] = i;
        for (int[] e : edges) {
            if (pos[e[0]] >= pos[e[1]]) return false;
        }
        return true;
    }
}
