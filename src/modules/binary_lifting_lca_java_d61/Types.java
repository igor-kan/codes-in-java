package com.igorkan.modules.binary_lifting_lca_java_d61;

public final class Types {
    private Types() {}
    public record LcaTable(int[] depth, int[][] up) {}
}
