package com.igorkan.modules.astar_grid_heuristic;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0}
        };
        Types.Cell s = new Types.Cell(0, 0), g = new Types.Cell(3, 4);
        Validation.validateGrid(grid, s, g);
        Types.GridPath res = new Core().findPath(grid, s, g);
        Invariants.verifyContiguousPassable(grid, res);
        assert res.found() && res.cost() == 7;
        assert res.cost() == FastPath.bfsShortestCost(grid, s, g);
    }
}
