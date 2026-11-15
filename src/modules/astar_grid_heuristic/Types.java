package com.igorkan.modules.astar_grid_heuristic;

public final class Types {
    private Types() {}
    public record Cell(int row, int col) {}
    public record GridPath(boolean found, int cost, java.util.List<Cell> cells) {}
}
