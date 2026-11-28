package com.igorkan.modules.gale_shapley_stable_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int[] match(int[][] prefsA, int[][] prefsB) {
        int n = prefsA.length;
        int[] matchA = new int[n];
        Arrays.fill(matchA, -1);
        if (n == 0) {
            return matchA;
        }
        int[][] rankB = new int[n][n];
        for (int b = 0; b < n; ++b) {
            for (int r = 0; r < prefsB[b].length; ++r) {
                int a = prefsB[b][r];
                if (a >= 0 && a < n) {
                    rankB[b][a] = r;
                }
            }
        }
        int[] matchB = new int[n];
        Arrays.fill(matchB, -1);
        int[] next = new int[n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int a = 0; a < n; ++a) {
            queue.add(a);
        }
        while (!queue.isEmpty()) {
            int a = queue.poll();
            if (matchA[a] != -1) {
                continue;
            }
            while (next[a] < prefsA[a].length) {
                int b = prefsA[a][next[a]++];
                if (b < 0 || b >= n) {
                    continue;
                }
                if (matchB[b] == -1) {
                    matchA[a] = b;
                    matchB[b] = a;
                    break;
                }
                int cur = matchB[b];
                if (rankB[b][a] < rankB[b][cur]) {
                    matchA[cur] = -1;
                    matchA[a] = b;
                    matchB[b] = a;
                    queue.add(cur);
                    break;
                }
            }
        }
        return matchA;
    }
}
