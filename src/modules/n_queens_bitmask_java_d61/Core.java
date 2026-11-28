package com.igorkan.modules.n_queens_bitmask_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public long countSolutions(int n) {
        if (n < 1) {
            return 0L;
        }
        return search(n, 0, 0, 0, 0);
    }

    private static long search(int n, int row, int cols, int diag, int anti) {
        if (row == n) {
            return 1L;
        }
        int mask = (1 << n) - 1;
        int avail = mask & ~(cols | diag | anti);
        long total = 0L;
        while (avail != 0) {
            int bit = avail & -avail;
            avail ^= bit;
            total += search(n, row + 1, cols | bit, (diag | bit) << 1, (anti | bit) >> 1);
        }
        return total;
    }

    @Override
    public int[] firstSolution(int n) {
        if (n < 1) {
            return new int[0];
        }
        int[] cols = new int[n];
        if (place(n, 0, 0, 0, 0, cols)) {
            return cols;
        }
        return new int[0];
    }

    private static boolean place(int n, int row, int usedCols, int diag, int anti, int[] cols) {
        if (row == n) {
            return true;
        }
        int mask = (1 << n) - 1;
        int avail = mask & ~(usedCols | diag | anti);
        while (avail != 0) {
            int bit = avail & -avail;
            avail ^= bit;
            cols[row] = Integer.numberOfTrailingZeros(bit);
            if (place(n, row + 1, usedCols | bit, (diag | bit) << 1, (anti | bit) >> 1, cols)) {
                return true;
            }
        }
        return false;
    }
}
