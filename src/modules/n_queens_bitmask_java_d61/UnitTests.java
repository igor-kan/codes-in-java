package com.igorkan.modules.n_queens_bitmask_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.countSolutions(1) != 1L) throw new AssertionError("n=1");
        if (c.countSolutions(4) != 2L) throw new AssertionError("n=4");
        if (c.countSolutions(8) != 92L) throw new AssertionError("n=8");
        int[] sol = c.firstSolution(8);
        boolean[] colSeen = new boolean[8];
        boolean[] d1 = new boolean[15];
        boolean[] d2 = new boolean[15];
        for (int r = 0; r < 8; ++r) {
            int col = sol[r];
            if (col < 0 || col >= 8 || colSeen[col] || d1[r + col] || d2[r - col + 7]) {
                throw new AssertionError("invalid solution");
            }
            colSeen[col] = true;
            d1[r + col] = true;
            d2[r - col + 7] = true;
        }
        Invariants.ensure(true, "unit ok");
    }
}
