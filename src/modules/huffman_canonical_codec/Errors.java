package com.igorkan.modules.huffman_canonical_codec;

public final class Errors {
    private Errors() {}

    public static final class HuffmanException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public HuffmanException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new HuffmanException(msg);
        }
    }
}
