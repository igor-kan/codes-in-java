package com.igorkan.modules.count_min_sketch_java;

public final class Types {
    private Types() {}

    public record SketchDims(int width, int depth, long seed) {}

    public static final class CmsTable {
        public final int width;
        public final int depth;
        public final long seed;
        public final long[][] grid;
        public long mass;

        public CmsTable(int width, int depth, long seed) {
            this.width = width;
            this.depth = depth;
            this.seed = seed;
            this.grid = new long[depth][width];
        }
    }
}
