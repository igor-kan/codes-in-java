package com.igorkan.modules.huffman_canonical_codec;

public final class FastPath {
    private FastPath() {}

    public static double compressionRatio(int rawBytes, Types.EncodedPayload payload) {
        return rawBytes == 0 ? 1.0 : ((double) payload.bitCount() / (8.0 * rawBytes));
    }
}
