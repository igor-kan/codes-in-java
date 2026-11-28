package com.igorkan.modules.fenwick_2d_rect_java_d61;

import java.util.*;

public final class Core implements Contract {
    private final int rows;
    private final int cols;
    private final long[][] tree;

    public Core(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.tree = new long[rows + 1][cols + 1];
    }

    @Override
    public void add(int x, int y, long delta) {
        for (int i = x + 1; i <= rows; i += i & -i) {
            for (int j = y + 1; j <= cols; j += j & -j) {
                tree[i][j] += delta;
            }
        }
    }

    private long prefix(int x, int y) {
        long sum = 0L;
        for (int i = x + 1; i > 0; i -= i & -i) {
            for (int j = y + 1; j > 0; j -= j & -j) {
                sum += tree[i][j];
            }
        }
        return sum;
    }

    @Override
    public long rectSum(Types.RectQuery q) {
        if (q.x1() > q.x2() || q.y1() > q.y2()) {
            return 0L;
        }
        long total = prefix(q.x2(), q.y2());
        if (q.x1() > 0) {
            total -= prefix(q.x1() - 1, q.y2());
        }
        if (q.y1() > 0) {
            total -= prefix(q.x2(), q.y1() - 1);
        }
        if (q.x1() > 0 && q.y1() > 0) {
            total += prefix(q.x1() - 1, q.y1() - 1);
        }
        return total;
    }
}
