package com.igorkan.modules.union_find_rollback_java;

public interface Contract {
    int find(int x);
    boolean unite(int a, int b);
    int snapshot();
    void rollback(int mark);
}
