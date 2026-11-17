package com.igorkan.modules.topological_kahn_java;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c=new Core(); var e=java.util.List.of(new int[]{0,1},new int[]{1,2},new int[]{2,3},new int[]{1,3}); for(int i=0;i<500;i++) sink += c.sortDag(4, e).longestPathLen();
        long ns = System.nanoTime() - t0;
        System.out.println("topological_kahn_java ns=" + ns + " sink=" + sink);
    }
}
