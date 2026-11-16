package com.igorkan.modules.count_min_sketch_java;

public final class Validation {
    private Validation() {}

    public static Types.CmsTable createValidated(int width, int depth, long seed) {
        Errors.require(width > 0 && depth > 0, "width and depth must be positive");
        return new Types.CmsTable(width, depth, seed);
    }
}
