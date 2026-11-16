package com.igorkan.modules.aho_corasick_java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class Core implements Contract {
    public final List<Types.AcNode> nodes = new ArrayList<>();
    public final List<String> patterns;

    public Core(List<String> patterns) {
        Validation.validatePatterns(patterns);
        this.patterns = List.copyOf(patterns);
        nodes.add(new Types.AcNode());
        for (int pid = 0; pid < this.patterns.size(); pid++) {
            String pat = this.patterns.get(pid);
            int cur = 0;
            for (int i = 0; i < pat.length(); i++) {
                int ch = pat.charAt(i);
                Errors.require(ch < 128, "ASCII pattern required");
                if (nodes.get(cur).next[ch] == 0) {
                    nodes.get(cur).next[ch] = nodes.size();
                    nodes.add(new Types.AcNode());
                }
                cur = nodes.get(cur).next[ch];
            }
            nodes.get(cur).outputs.add(pid);
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int c = 0; c < 128; c++) {
            int nxt = nodes.get(0).next[c];
            if (nxt != 0) q.add(nxt);
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            int f = nodes.get(u).fail;
            nodes.get(u).outputs.addAll(nodes.get(f).outputs);
            for (int c = 0; c < 128; c++) {
                int nxt = nodes.get(u).next[c];
                int fallback = nodes.get(f).next[c];
                if (nxt != 0) {
                    nodes.get(nxt).fail = fallback;
                    q.add(nxt);
                } else {
                    nodes.get(u).next[c] = fallback;
                }
            }
        }
    }

    @Override
    public List<Types.Match> findAll(String text) {
        List<Types.Match> res = new ArrayList<>();
        int state = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            state = (ch < 128) ? nodes.get(state).next[ch] : 0;
            for (int pid : nodes.get(state).outputs) {
                res.add(new Types.Match(i + 1 - patterns.get(pid).length(), pid));
            }
        }
        return res;
    }
}
