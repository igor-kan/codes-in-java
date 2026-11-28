package com.igorkan.modules.fenwick_2d_rect_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        int rows = 5;
        int cols = 6;
        Core fen = new Core(rows, cols);
        long[][] grid = new long[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                long v = (i * 7 + j * 3) % 11;
                grid[i][j] = v;
                fen.add(i, j, v);
            }
        }
        for (int x1 = 0; x1 < rows; ++x1) {
            for (int y1 = 0; y1 < cols; ++y1) {
                for (int x2 = x1; x2 < rows; ++x2) {
                    for (int y2 = y1; y2 < cols; ++y2) {
                        long want = 0L;
                        for (int i = x1; i <= x2; ++i) {
                            for (int j = y1; j <= y2; ++j) {
                                want += grid[i][j];
                            }
                        }
                        if (fen.rectSum(new Types.RectQuery(x1, y1, x2, y2)) != want) {
                            throw new AssertionError("rectangle mismatch");
                        }
                    }
                }
            }
        }
    }
}
