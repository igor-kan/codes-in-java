package com.igorkan.modules.dual_fenwick_range_java;

public interface Contract {
    void rangeAdd(int lo, int hi, long delta);
    long rangeSum(int lo, int hi);
}
