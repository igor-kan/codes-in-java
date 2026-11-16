package com.igorkan.modules.lfu_o1_cache_java;

public interface Contract {
    int get(int key);
    void put(int key, int value);
    int size();
}
