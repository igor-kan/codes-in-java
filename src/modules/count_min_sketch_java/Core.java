package com.igorkan.modules.count_min_sketch_java;

public final class Core implements Contract {
    public final Types.CmsTable table;

    public Core(Types.CmsTable table) {
        this.table = table;
    }

    public static int rowHash(long key, int row, int width, long seed) {
        long z = key ^ (seed + (long) row * 0x9e3779b97f4a7c15L);
        z = (z ^ (z >>> 30)) * 0xbf58476d1ce4e5b9L;
        z = (z ^ (z >>> 27)) * 0x94d049bb133111ebL;
        z ^= (z >>> 31);
        return Long.remainderUnsigned(z, width) < 0 ? 0 : (int) Long.remainderUnsigned(z, width);
    }

    @Override
    public void increment(long key, long count) {
        Errors.require(count >= 0, "negative count rejected");
        long curMin = Long.MAX_VALUE;
        for (int r = 0; r < table.depth; r++) {
            int c = rowHash(key, r, table.width, table.seed);
            if (table.grid[r][c] < curMin) curMin = table.grid[r][c];
        }
        long target = curMin + count;
        for (int r = 0; r < table.depth; r++) {
            int c = rowHash(key, r, table.width, table.seed);
            if (table.grid[r][c] < target) table.grid[r][c] = target;
        }
        table.mass += count;
    }

    @Override
    public long query(long key) {
        long ans = Long.MAX_VALUE;
        for (int r = 0; r < table.depth; r++) {
            int c = rowHash(key, r, table.width, table.seed);
            if (table.grid[r][c] < ans) ans = table.grid[r][c];
        }
        return ans;
    }

    @Override
    public void merge(Types.CmsTable other) {
        Errors.require(other.width == table.width && other.depth == table.depth, "dimension mismatch");
        for (int r = 0; r < table.depth; r++) {
            for (int c = 0; c < table.width; c++) {
                table.grid[r][c] += other.grid[r][c];
            }
        }
        table.mass += other.mass;
    }
}
