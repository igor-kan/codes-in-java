package com.igorkan.modules.aho_corasick_trie_java;

public final class Types {
    private Types() {}
    public record MatchStats(long totalHits, int states) {}
}
