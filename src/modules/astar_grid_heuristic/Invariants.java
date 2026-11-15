package com.igorkan.modules.astar_grid_heuristic;

public final class Invariants {
    private Invariants() {}

    public static void verifyContiguousPassable(int[][] grid, Types.GridPath path) {
        if (!path.found()) return;
        java.util.List<Types.Cell> c = path.cells();
        Errors.require(c.size() == path.cost() + 1, "cell count != cost + 1");
        for (int i = 0; i < c.size(); i++) {
            Types.Cell cur = c.get(i);
            Errors.require(grid[cur.row()][cur.col()] == 0, "path enters wall");
            if (i > 0) {
                Errors.require(Core.manhattan(c.get(i - 1).row(), c.get(i - 1).col(), cur.row(), cur.col()) == 1, "non-unit step");
            }
        }
    }
}
