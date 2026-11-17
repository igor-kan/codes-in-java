package com.igorkan.modules.sliding_window_deque_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c=new Core(); int[] a=new int[512]; for(int i=0;i<512;i++) a[i]=(i*29)%71; for(int it=0;it<200;it++) sink += FastPath.rangeSpreadSum(c.compute(a, 16));
        long ns = System.nanoTime() - t0;
        System.out.println("sliding_window_deque_java ns=" + ns + " sink=" + sink);
    }
}
