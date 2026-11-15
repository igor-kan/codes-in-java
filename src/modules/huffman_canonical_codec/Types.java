package com.igorkan.modules.huffman_canonical_codec;

public final class Types {
    private Types() {}
    public record CodeEntry(int symbol, int bitLen, int codeBits) {}
    public record EncodedPayload(byte[] bits, int bitCount) {}
}
