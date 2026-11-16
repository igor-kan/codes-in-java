package com.igorkan.modules.count_min_sketch_java;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        Core c = new Core(Validation.createValidated(512, 4, 7L)); long[] ks = new long[512]; for(int i=0;i<512;i++) ks[i]=i; for(int it=0;it<100;it++){ FastPath.batchIncrement(c, ks); sink += c.query(it & 255); }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("count_min_sketch_java ns=" + ns + " sink=" + sink);
    }
}
