package com.igorkan.modules.sparse_table_idempotent_java;

public interface Contract {
    Types.RangeStat queryRange(long[] arr, int l, int r);
}
