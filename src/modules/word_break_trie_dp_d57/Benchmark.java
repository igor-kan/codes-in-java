package com.igorkan.modules.word_break_trie_dp_d57;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        String[] d = {"leet", "code", "le", "et"};
        for (int it = 0; it < 200; it++) sink += c.minWordSegments("leetcode", d);
        long ns = System.nanoTime() - t0;
        System.out.println("word_break_trie_dp_d57 ns=" + ns + " sink=" + sink);
    }
}
