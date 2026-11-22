package com.igorkan.modules.trie_wildcard_match_d57;

import java.util.*;

public final class Core implements Contract {
    private static final class Node {
        final Node[] ch = new Node[26];
        boolean word;
    }

    private final Node root = new Node();

    public void addWord(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (cur.ch[c] == null) cur.ch[c] = new Node();
            cur = cur.ch[c];
        }
        cur.word = true;
    }

    @Override
    public boolean search(String pat) { return match(pat, 0, root); }

    private boolean match(String pat, int i, Node node) {
        if (node == null) return false;
        if (i == pat.length()) return node.word;
        char c = pat.charAt(i);
        if (c == '.') {
            for (Node nxt : node.ch) {
                if (nxt != null && match(pat, i + 1, nxt)) return true;
            }
            return false;
        }
        return match(pat, i + 1, node.ch[c - 'a']);
    }
}
