package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class Types {
    public record TopoResult(List<Integer> order, int longestPathLen, int[] depth) {}
}
