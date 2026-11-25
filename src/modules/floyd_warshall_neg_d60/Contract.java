package com.igorkan.modules.floyd_warshall_neg_d60;

public interface Contract {
    long[][] allPairs(int n, int[] u, int[] v, long[] w); boolean hasNegativeCycle(long[][] dist);
}
