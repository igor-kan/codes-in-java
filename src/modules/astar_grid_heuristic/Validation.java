package com.igorkan.modules.astar_grid_heuristic;

public final class Validation {
    private Validation() {}
    public static void validateGrid(int[][] grid, Types.Cell start, Types.Cell goal) {
        Errors.require(grid != null && grid.length > 0 && grid[0].length > 0, "empty grid");
        int R = grid.length, C = grid[0].length;
        Errors.require(start.row() >= 0 && start.row() < R && start.col() >= 0 && start.col() < C, "start out of bounds");
        Errors.require(goal.row() >= 0 && goal.row() < R && goal.col() >= 0 && goal.col() < C, "goal out of bounds");
        Errors.require(grid[start.row()][start.col()] == 0 && grid[goal.row()][goal.col()] == 0, "blocked endpoint");
    }
}
