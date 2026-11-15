package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.ArrayList;
import java.util.List;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        List<Types.PointKD> pts = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            pts.add(new Types.PointKD(i, new double[]{(i * 37) % 53, (i * 19) % 41, (i * 13) % 29}));
        }
        Core kd = new Core(pts);
        for (int q = 0; q < 25; q++) {
            Invariants.verifyMatchesBruteForce(kd, new double[]{q * 1.9, (q * 7) % 35, 11.5});
        }
    }
}
