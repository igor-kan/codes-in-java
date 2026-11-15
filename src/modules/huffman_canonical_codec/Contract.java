package com.igorkan.modules.huffman_canonical_codec;

public interface Contract {
    Types.EncodedPayload encode(byte[] data);
    byte[] decode(Types.EncodedPayload payload);
}
