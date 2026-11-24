package com.igorkan.modules.aho_corasick_java_d59;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int countMultiHits(String[] patterns, String text) {
        int cap = 1;
        for (String p : patterns) cap += p.length();
        int[][] nxt = new int[cap][26];
        int[] fail = new int[cap];
        int[] out = new int[cap];
        int sz = 1;
        for (String p : patterns) {
            int cur = 0;
            for (int i = 0; i < p.length(); i++) {
                int c = p.charAt(i) - 'a';
                if (nxt[cur][c] == 0) nxt[cur][c] = sz++;
                cur = nxt[cur][c];
            }
            out[cur]++;
        }
        Deque<Integer> q = new ArrayDeque<>();
        for (int c = 0; c < 26; c++) if (nxt[0][c] != 0) q.add(nxt[0][c]);
        while (!q.isEmpty()) {
            int u = q.poll();
            out[u] += out[fail[u]];
            for (int c = 0; c < 26; c++) {
                if (nxt[u][c] != 0) {
                    fail[nxt[u][c]] = nxt[fail[u]][c];
                    q.add(nxt[u][c]);
                } else {
                    nxt[u][c] = nxt[fail[u]][c];
                }
            }
        }
        int cur = 0, total = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < 'a' || ch > 'z') { cur = 0; continue; }
            cur = nxt[cur][ch - 'a'];
            total += out[cur];
        }
        return total;
    }
}
