package com.igorkan.modules.huffman_canonical_codec;

import java.util.List;

public final class Concurrent {
    private Concurrent() {}

    public static List<Types.EncodedPayload> encodeParallel(Core codec, List<byte[]> blocks) {
        return blocks.parallelStream().map(codec::encode).toList();
    }
}
