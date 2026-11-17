package com.igorkan.modules.bloom_counting_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core bf=new Core(1024,4); for(int i=0;i<200;i++) bf.add(i); for(int it=0;it<1000;it++) if(bf.mayContain(it%250)) sink++;
        long ns = System.nanoTime() - t0;
        System.out.println("bloom_counting_java ns=" + ns + " sink=" + sink);
    }
}
