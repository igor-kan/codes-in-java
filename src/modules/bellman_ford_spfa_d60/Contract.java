package com.igorkan.modules.bellman_ford_spfa_d60;

public interface Contract {
    long[] shortestPaths(int n, int src, int[] us, int[] vs, long[] ws);
}
