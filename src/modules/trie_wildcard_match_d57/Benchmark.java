package com.igorkan.modules.trie_wildcard_match_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core tr = new Core(); tr.addWord("bench");
        for (int it = 0; it < 200; it++) sink += tr.search("b.n.h") ? 1 : 0;
        long ns = System.nanoTime() - t0;
        System.out.println("trie_wildcard_match_d57 ns=" + ns + " sink=" + sink);
    }
}
