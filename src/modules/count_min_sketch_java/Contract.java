package com.igorkan.modules.count_min_sketch_java;

public interface Contract {
    void increment(long key, long count);
    long query(long key);
    void merge(Types.CmsTable other);
}
