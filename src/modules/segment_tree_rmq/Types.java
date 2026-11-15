package com.igorkan.modules.segment_tree_rmq;

public final class Types {
    private Types() {}
    public record SegConfig(int size) {}
    public record RangeOp(int l, int r, long delta) {}
}
