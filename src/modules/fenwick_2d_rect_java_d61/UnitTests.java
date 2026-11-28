package com.igorkan.modules.fenwick_2d_rect_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core f = new Core(4, 4);
        f.add(1, 1, 5L);
        f.add(3, 3, 7L);
        f.add(1, 3, -2L);
        if (f.rectSum(new Types.RectQuery(0, 0, 3, 3)) != 10L) throw new AssertionError("full");
        if (f.rectSum(new Types.RectQuery(1, 1, 1, 1)) != 5L) throw new AssertionError("cell");
        if (f.rectSum(new Types.RectQuery(1, 2, 3, 3)) != 5L) throw new AssertionError("corner");
        Invariants.ensure(true, "unit ok");
    }
}
