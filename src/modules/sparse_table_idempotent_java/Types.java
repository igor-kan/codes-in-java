package com.igorkan.modules.sparse_table_idempotent_java;

public final class Types {
    private Types() {}
    public record RangeStat(long minVal, long gcdVal) {}
}
