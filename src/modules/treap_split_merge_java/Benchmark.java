package com.igorkan.modules.treap_split_merge_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core t=new Core(); for(int i=0;i<256;i++) t.insert((i*41)%256); for(int it=0;it<500;it++) sink += t.kthSmallest(it % t.size());
        long ns = System.nanoTime() - t0;
        System.out.println("treap_split_merge_java ns=" + ns + " sink=" + sink);
    }
}
