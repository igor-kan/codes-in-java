package com.igorkan.modules.hopcroft_karp_matching_java;

public final class Types {
    private Types() {}
    public record MatchResult(int cardinality, int[] pairU) {}
}
