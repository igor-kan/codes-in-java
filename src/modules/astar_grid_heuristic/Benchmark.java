package com.igorkan.modules.astar_grid_heuristic;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        int[][] grid = new int[32][32];
        for (int r = 4; r < 28; r++) grid[r][16] = 1;
        Core solver = new Core();
        Types.Cell s = new Types.Cell(15, 2), g = new Types.Cell(15, 29);
        long t0 = System.nanoTime();
        int sink = 0;
        for (int i = 0; i < 500; i++) sink += solver.findPath(grid, s, g).cost();
        System.out.println("astar_grid_heuristic ns=" + (System.nanoTime() - t0) / 500 + " sink=" + sink);
    }
}
