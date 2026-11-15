package com.igorkan.modules.astar_grid_heuristic;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        int[][] grid = new int[10][10];
        for (int i = 1; i < 8; i++) grid[i][5] = 1;
        Types.Cell s = new Types.Cell(4, 1), g = new Types.Cell(4, 8);
        Types.GridPath res = new Core().findPath(grid, s, g);
        Invariants.verifyContiguousPassable(grid, res);
        assert res.cost() == FastPath.bfsShortestCost(grid, s, g);
    }
}
