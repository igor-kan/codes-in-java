package com.igorkan.modules.huffman_canonical_codec;

public final class Validation {
    private Validation() {}

    public static void verifyKraftInequality(Types.CodeEntry[] table) {
        double kraft = 0.0;
        for (Types.CodeEntry e : table) {
            if (e != null) kraft += Math.pow(2.0, -e.bitLen());
        }
        Errors.require(kraft <= 1.0 + 1e-12, "Kraft inequality violated: " + kraft);
    }
}
