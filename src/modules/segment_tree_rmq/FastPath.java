package com.igorkan.modules.segment_tree_rmq;

public final class FastPath {
    private FastPath() {}

    public static long globalMinFast(Core seg) {
        return seg.tree[1];
    }
}
