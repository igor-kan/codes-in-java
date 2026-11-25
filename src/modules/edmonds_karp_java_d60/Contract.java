package com.igorkan.modules.edmonds_karp_java_d60;

public interface Contract {
    long solveMaxFlow(int n, int s, int t, int[] us, int[] vs, long[] caps);
}
