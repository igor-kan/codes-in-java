package com.igorkan.modules.treap_split_merge_java;

public interface Contract {
    boolean insert(int key);
    boolean erase(int key);
    int kthSmallest(int k);
}
