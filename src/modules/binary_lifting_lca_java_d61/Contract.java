package com.igorkan.modules.binary_lifting_lca_java_d61;

public interface Contract {
    Types.LcaTable build(int[] parent);
    int lca(Types.LcaTable table, int a, int b);
}
