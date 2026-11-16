package com.igorkan.modules.lfu_o1_cache_java;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        Core c = new Core(64); for(int it=0;it<100;it++){ for(int k=0;k<256;k++){ int v=c.get(k%96); if(v==-1) c.put(k%96, k); else sink+=v; } }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("lfu_o1_cache_java ns=" + ns + " sink=" + sink);
    }
}
