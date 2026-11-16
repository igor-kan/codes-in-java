package com.igorkan.modules.aho_corasick_java;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        Core ac = new Core(java.util.List.of("alpha", "beta", "gamma", "delta")); String txt = "alpha_beta_gamma_delta_".repeat(64); for(int it=0;it<100;it++){ sink += FastPath.countMatches(ac, txt); }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("aho_corasick_java ns=" + ns + " sink=" + sink);
    }
}
