package com.igorkan.modules.astar_grid_heuristic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public final class Core implements Contract {
    private record State(int f, int g, int r, int c) {}
    private static final int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};

    public static int manhattan(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

    @Override
    public Types.GridPath findPath(int[][] grid, Types.Cell start, Types.Cell goal) {
        int rows = grid.length, cols = grid[0].length;
        int[][] gScore = new int[rows][cols];
        int[][] parent = new int[rows][cols];
        for (int[] row : gScore) Arrays.fill(row, Integer.MAX_VALUE);
        for (int[] row : parent) Arrays.fill(row, -1);

        PriorityQueue<State> open = new PriorityQueue<>(Comparator.comparingInt(State::f).thenComparingInt(State::g));
        gScore[start.row()][start.col()] = 0;
        open.add(new State(manhattan(start.row(), start.col(), goal.row(), goal.col()), 0, start.row(), start.col()));

        while (!open.isEmpty()) {
            State cur = open.poll();
            if (cur.g() > gScore[cur.r()][cur.c()]) continue;
            if (cur.r() == goal.row() && cur.c() == goal.col()) {
                List<Types.Cell> cells = new ArrayList<>();
                int pos = cur.r() * cols + cur.c();
                while (pos != -1) {
                    int pr = pos / cols, pc = pos % cols;
                    cells.add(new Types.Cell(pr, pc));
                    pos = parent[pr][pc];
                }
                Collections.reverse(cells);
                return new Types.GridPath(true, cur.g(), cells);
            }
            for (int[] d : DIRS) {
                int nr = cur.r() + d[0], nc = cur.c() + d[1];
                if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || grid[nr][nc] != 0) continue;
                int ng = cur.g() + 1;
                if (ng < gScore[nr][nc]) {
                    gScore[nr][nc] = ng;
                    parent[nr][nc] = cur.r() * cols + cur.c();
                    open.add(new State(ng + manhattan(nr, nc, goal.row(), goal.col()), ng, nr, nc));
                }
            }
        }
        return new Types.GridPath(false, -1, List.of());
    }
}
