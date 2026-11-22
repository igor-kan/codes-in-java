package com.igorkan.modules.tarjan_bridge_cut_d57;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        int[] pts = c.articulationPoints(4, new int[]{0, 1, 2}, new int[]{1, 2, 3});
        if (!Arrays.equals(pts, new int[]{1, 2})) throw new AssertionError(Arrays.toString(pts));
        Invariants.ensure(true, "unit ok");
    }
}
