package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.List;

public final class FastPath {
    private FastPath() {}

    public static Types.NearestHit bruteForceNearest(List<Types.PointKD> pts, double[] q) {
        int bestId = -1;
        double bestD2 = Double.POSITIVE_INFINITY;
        for (Types.PointKD p : pts) {
            double d2 = Core.distSq(p.coords(), q);
            if (d2 < bestD2) {
                bestD2 = d2;
                bestId = p.id();
            }
        }
        return new Types.NearestHit(bestId, bestD2);
    }
}
