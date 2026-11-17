package com.igorkan.modules.dual_fenwick_range_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core df=new Core(256); for(int it=0;it<500;it++){ df.rangeAdd(it%64, 128+(it%64), 3); sink += df.rangeSum(0, 255); }
        long ns = System.nanoTime() - t0;
        System.out.println("dual_fenwick_range_java ns=" + ns + " sink=" + sink);
    }
}
