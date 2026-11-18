package com.igorkan.modules.dinic_maxflow_scaling_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); var es = List.of(new Types.EdgeSpec(0,1,5), new Types.EdgeSpec(1,2,5)); for(int i=0;i<200;i++) sink += c.maxFlow(3, 0, 2, es);
        long ns = System.nanoTime() - t0;
        System.out.println("dinic_maxflow_scaling_java ns=" + ns + " sink=" + sink);
    }
}
