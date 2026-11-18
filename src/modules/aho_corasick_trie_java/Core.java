package com.igorkan.modules.aho_corasick_trie_java;

import java.util.*;

public final class Core implements Contract {
    @Override
    public Types.MatchStats countMatches(List<String> patterns, String text) {
        List<int[]> next = new ArrayList<>();
        List<Integer> fail = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        next.add(new int[26]); Arrays.fill(next.get(0), -1);
        fail.add(0); out.add(0);
        for (String p : patterns) {
            int u = 0;
            for (int i = 0; i < p.length(); i++) {
                int c = p.charAt(i) - 'a';
                if (next.get(u)[c] == -1) {
                    next.get(u)[c] = next.size();
                    int[] row = new int[26]; Arrays.fill(row, -1);
                    next.add(row); fail.add(0); out.add(0);
                }
                u = next.get(u)[c];
            }
            out.set(u, out.get(u) + 1);
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int c = 0; c < 26; c++) {
            int v = next.get(0)[c];
            if (v != -1) q.add(v);
            else next.get(0)[c] = 0;
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int c = 0; c < 26; c++) {
                int v = next.get(u)[c];
                if (v != -1) {
                    fail.set(v, next.get(fail.get(u))[c]);
                    out.set(v, out.get(v) + out.get(fail.get(v)));
                    q.add(v);
                } else {
                    next.get(u)[c] = next.get(fail.get(u))[c];
                }
            }
        }
        long hits = 0;
        int cur = 0;
        for (int i = 0; i < text.length(); i++) {
            cur = next.get(cur)[text.charAt(i) - 'a'];
            hits += out.get(cur);
        }
        return new Types.MatchStats(hits, next.size());
    }
}
