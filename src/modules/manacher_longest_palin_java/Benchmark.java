package com.igorkan.modules.manacher_longest_palin_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); String s = "abacaba".repeat(16); for(int i=0;i<500;i++) sink += c.analyze(s).totalSubstrings();
        long ns = System.nanoTime() - t0;
        System.out.println("manacher_longest_palin_java ns=" + ns + " sink=" + sink);
    }
}
