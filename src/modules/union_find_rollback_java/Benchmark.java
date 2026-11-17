package com.igorkan.modules.union_find_rollback_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core d=new Core(128); for(int it=0;it<200;it++){ int s=d.snapshot(); for(int j=0;j<32;j++) d.unite(j, j+1); sink += d.components(); d.rollback(s); }
        long ns = System.nanoTime() - t0;
        System.out.println("union_find_rollback_java ns=" + ns + " sink=" + sink);
    }
}
