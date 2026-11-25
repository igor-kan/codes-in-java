package com.igorkan.modules.trie_radix_compact_d60;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core t = new Core();
        t.addWord("apple"); t.addWord("apply"); t.addWord("apex");
        for (int it = 0; it < 200; ++it) sink += t.countWithPrefix("ap");
        long ns = System.nanoTime() - t0;
        System.out.println("trie_radix_compact_d60 ns=" + ns + " sink=" + sink);
    }
}
