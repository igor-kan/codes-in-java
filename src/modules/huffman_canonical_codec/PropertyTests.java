package com.igorkan.modules.huffman_canonical_codec;

import java.nio.charset.StandardCharsets;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        byte[] single = "aaaaaaaaaaaa".getBytes(StandardCharsets.UTF_8);
        Core c1 = new Core(single);
        Validation.verifyKraftInequality(c1.table);
        Invariants.verifyRoundtrip(c1, single);

        byte[] multi = "abacabadabacabaeabacabadabacabaf".getBytes(StandardCharsets.UTF_8);
        Core c2 = new Core(multi);
        Validation.verifyKraftInequality(c2.table);
        Invariants.verifyRoundtrip(c2, multi);
    }
}
