package com.igorkan.modules.cartesian_rmq_tree_java;

public final class Types {
    private Types() {}
    public record TreeDesc(int root, int[] left, int[] right) {}
}
