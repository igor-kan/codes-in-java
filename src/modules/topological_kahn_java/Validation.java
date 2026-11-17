package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class Validation {
    public static void validateEdges(int n, List<int[]> edges) {
        if (n <= 0) throw new Errors.TopoException(Errors.ErrorCode.INVALID_INPUT, "vertex count must be positive");
        for (int[] e : edges) {
            if (e[0] < 0 || e[0] >= n || e[1] < 0 || e[1] >= n) {
                throw new Errors.TopoException(Errors.ErrorCode.OUT_OF_BOUNDS, "edge endpoint out of bounds");
            }
        }
    }
}
