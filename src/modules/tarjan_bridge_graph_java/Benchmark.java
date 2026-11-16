package com.igorkan.modules.tarjan_bridge_graph_java;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0L;
        java.util.List<Types.Edge> es = new java.util.ArrayList<>(); for(int i=0;i<512;i++){es.add(new Types.Edge(i,(i+1)&511)); if(i%8==0) es.add(new Types.Edge(i,(i+3)&511));} for(int it=0;it<100;it++){ sink += FastPath.countBridges(512, es); }
        long ns = (System.nanoTime() - t0) / 100L;
        System.out.println("tarjan_bridge_graph_java ns=" + ns + " sink=" + sink);
    }
}
