package com.igorkan.modules.heavy_hitter_misra_gries;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        Core mg = new Core(16); long[] a = new long[512]; for(int i=0;i<512;i++) a[i]=(i%4==0)?1:(i%40); for(int it=0;it<100;it++){ FastPath.ingestBatch(mg, a); sink+=mg.counters.size(); }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("heavy_hitter_misra_gries ns=" + ns + " sink=" + sink);
    }
}
