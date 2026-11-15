package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.List;

public final class Validation {
    private Validation() {}

    public static void validateUniformDims(List<Types.PointKD> pts) {
        Errors.require(pts != null && !pts.isEmpty(), "point list empty");
        int d = pts.get(0).coords().length;
        Errors.require(d > 0, "zero dimensionality");
        for (Types.PointKD p : pts) {
            Errors.require(p.coords().length == d, "ragged point dimensionality");
        }
    }
}
