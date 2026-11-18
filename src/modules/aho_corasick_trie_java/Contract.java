package com.igorkan.modules.aho_corasick_trie_java;

public interface Contract {
    Types.MatchStats countMatches(java.util.List<String> patterns, String text);
}
