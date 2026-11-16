package com.igorkan.modules.interval_coalesce_tree_java;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        for(int it=0;it<100;it++){ Core t = new Core(); for(int i=0;i<200;i++) t.addRange((i*7)%300, ((i*7)%300)+10); sink+=t.coveredPoints(); }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("interval_coalesce_tree_java ns=" + ns + " sink=" + sink);
    }
}
