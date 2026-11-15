package com.igorkan.modules.segment_tree_rmq;

public interface Contract {
    void rangeAdd(int l, int r, long delta);
    long rangeMin(int l, int r);
}
