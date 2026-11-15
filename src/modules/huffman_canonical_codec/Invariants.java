package com.igorkan.modules.huffman_canonical_codec;

import java.util.Arrays;

public final class Invariants {
    private Invariants() {}

    public static void verifyRoundtrip(Core codec, byte[] raw) {
        byte[] decoded = codec.decode(codec.encode(raw));
        Errors.require(Arrays.equals(raw, decoded), "Huffman lossless roundtrip failed");
    }
}
