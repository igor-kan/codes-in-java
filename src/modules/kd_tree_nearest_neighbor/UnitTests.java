package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.List;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        List<Types.PointKD> pts = List.of(
            new Types.PointKD(0, new double[]{2.0, 3.0}),
            new Types.PointKD(1, new double[]{5.0, 4.0}),
            new Types.PointKD(2, new double[]{9.0, 6.0}),
            new Types.PointKD(3, new double[]{4.0, 7.0}),
            new Types.PointKD(4, new double[]{8.0, 1.0})
        );
        Validation.validateUniformDims(pts);
        Core kd = new Core(pts);
        Types.NearestHit hit = kd.nearest(new double[]{8.8, 5.8});
        assert hit.id() == 2;
        Invariants.verifyMatchesBruteForce(kd, new double[]{8.8, 5.8});
    }
}
