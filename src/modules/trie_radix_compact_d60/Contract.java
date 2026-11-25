package com.igorkan.modules.trie_radix_compact_d60;

public interface Contract {
    void addWord(String w); int countWithPrefix(String pfx); String longestMatchPrefix(String query);
}
