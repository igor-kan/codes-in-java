package com.igorkan.modules.astar_grid_heuristic;

import java.util.ArrayDeque;
import java.util.Arrays;

public final class FastPath {
    private FastPath() {}
    private static final int[][] DIRS = {{-1,0},{1,0},{0,-1},{0,1}};

    public static int bfsShortestCost(int[][] grid, Types.Cell start, Types.Cell goal) {
        int R = grid.length, C = grid[0].length;
        int[][] dist = new int[R][C];
        for (int[] r : dist) Arrays.fill(r, -1);
        ArrayDeque<Types.Cell> q = new ArrayDeque<>();
        dist[start.row()][start.col()] = 0;
        q.add(start);
        while (!q.isEmpty()) {
            Types.Cell u = q.poll();
            if (u.equals(goal)) return dist[u.row()][u.col()];
            for (int[] d : DIRS) {
                int nr = u.row() + d[0], nc = u.col() + d[1];
                if (nr >= 0 && nr < R && nc >= 0 && nc < C && grid[nr][nc] == 0 && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[u.row()][u.col()] + 1;
                    q.add(new Types.Cell(nr, nc));
                }
            }
        }
        return -1;
    }
}
