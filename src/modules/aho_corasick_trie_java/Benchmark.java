package com.igorkan.modules.aho_corasick_trie_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); for(int i=0;i<200;i++) sink += c.countMatches(List.of("ab","ba"), "abababa").totalHits();
        long ns = System.nanoTime() - t0;
        System.out.println("aho_corasick_trie_java ns=" + ns + " sink=" + sink);
    }
}
