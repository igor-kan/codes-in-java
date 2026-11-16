package com.igorkan.modules.heavy_hitter_misra_gries;

public final class Validation {
    private Validation() {}

    public static void validateK(int k) {
        Errors.require(k >= 2, "k must be >= 2 for Misra-Gries summary");
    }
}
