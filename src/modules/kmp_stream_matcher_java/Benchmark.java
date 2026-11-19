package com.igorkan.modules.kmp_stream_matcher_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); for(int i=0;i<200;i++) sink += c.findAll("ababaababa", "aba").size();
        long ns = System.nanoTime() - t0;
        System.out.println("kmp_stream_matcher_java ns=" + ns + " sink=" + sink);
    }
}
