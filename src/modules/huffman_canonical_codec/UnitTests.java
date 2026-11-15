package com.igorkan.modules.huffman_canonical_codec;

import java.nio.charset.StandardCharsets;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        byte[] msg = "mississippi_river_compression_test".getBytes(StandardCharsets.UTF_8);
        Core codec = new Core(msg);
        Validation.verifyKraftInequality(codec.table);
        Invariants.verifyRoundtrip(codec, msg);
        assert FastPath.compressionRatio(msg.length, codec.encode(msg)) < 0.75;
    }
}
