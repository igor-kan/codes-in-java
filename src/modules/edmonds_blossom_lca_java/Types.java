package com.igorkan.modules.edmonds_blossom_lca_java;

public final class Types {
    private Types() {}
    public record GeneralMatch(int matchedPairs, int[] mate) {}
}
