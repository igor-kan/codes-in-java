package com.igorkan.modules.kd_tree_nearest_neighbor;

public final class Invariants {
    private Invariants() {}

    public static void verifyMatchesBruteForce(Core kd, double[] query) {
        Types.NearestHit fast = kd.nearest(query);
        Types.NearestHit ref = FastPath.bruteForceNearest(kd.allPoints(), query);
        Errors.require(Math.abs(fast.distSq() - ref.distSq()) < 1e-12, "kd-tree missed nearest neighbor");
    }
}
