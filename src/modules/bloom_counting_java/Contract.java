package com.igorkan.modules.bloom_counting_java;

public interface Contract {
    void add(long key);
    boolean remove(long key);
    boolean mayContain(long key);
}
