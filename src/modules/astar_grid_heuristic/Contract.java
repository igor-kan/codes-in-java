package com.igorkan.modules.astar_grid_heuristic;

public interface Contract {
    Types.GridPath findPath(int[][] grid, Types.Cell start, Types.Cell goal);
}
