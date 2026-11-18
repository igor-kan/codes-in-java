package com.igorkan.modules.dinic_maxflow_scaling_java;

public interface Contract {
    long maxFlow(int n, int s, int t, java.util.List<Types.EdgeSpec> edges);
}
