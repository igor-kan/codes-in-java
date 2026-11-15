package com.igorkan.modules.segment_tree_rmq;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long[] a = new long[1024];
        Core seg = new Core(a);
        long t0 = System.nanoTime();
        long sink = 0;
        for (int i = 0; i < 10000; i++) {
            seg.rangeAdd(i % 500, 900, 1);
            sink += seg.rangeMin(100, 800);
        }
        System.out.println("segment_tree_rmq ns=" + (System.nanoTime() - t0) / 10000 + " sink=" + sink);
    }
}
