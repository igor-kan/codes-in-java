package com.igorkan.modules.trie_radix_compact_d60;

import java.util.*;

public final class Core implements Contract {
    private static final class TNode {
        final TNode[] ch = new TNode[26];
        int pfxCount = 0;
        boolean term = false;
    }
    private final TNode root = new TNode();
    @Override public void addWord(String w) {
        TNode c = root; c.pfxCount++;
        for (int i = 0; i < w.length(); ++i) {
            int b = w.charAt(i) - 'a';
            if (b < 0 || b >= 26) continue;
            if (c.ch[b] == null) c.ch[b] = new TNode();
            c = c.ch[b];
            c.pfxCount++;
        }
        c.term = true;
    }
    @Override public int countWithPrefix(String pfx) {
        TNode c = root;
        for (int i = 0; i < pfx.length(); ++i) {
            int b = pfx.charAt(i) - 'a';
            if (b < 0 || b >= 26 || c.ch[b] == null) return 0;
            c = c.ch[b];
        }
        return c.pfxCount;
    }
    @Override public String longestMatchPrefix(String query) {
        TNode c = root; int best = 0;
        for (int i = 0; i < query.length(); ++i) {
            int b = query.charAt(i) - 'a';
            if (b < 0 || b >= 26 || c.ch[b] == null) break;
            c = c.ch[b];
            if (c.term) best = i + 1;
        }
        return query.substring(0, best);
    }
}
