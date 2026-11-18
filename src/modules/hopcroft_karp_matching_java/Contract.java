package com.igorkan.modules.hopcroft_karp_matching_java;

public interface Contract {
    Types.MatchResult maxMatching(int nLeft, int nRight, int[][] edges);
}
