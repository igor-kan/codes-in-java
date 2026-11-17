package com.igorkan.modules.suffix_array_kasai_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c=new Core(); String txt="banana_abracadabra_".repeat(8); for(int it=0;it<200;it++) sink += FastPath.countOccurrences(c.build(txt), "abra");
        long ns = System.nanoTime() - t0;
        System.out.println("suffix_array_kasai_java ns=" + ns + " sink=" + sink);
    }
}
