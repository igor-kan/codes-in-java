package com.igorkan.modules.rope_balanced_text;

public final class Invariants {
    private Invariants() {}

    public static void verifyCharacterParity(Types.RopeNode root, Core core, String expected) {
        Errors.require((root == null ? 0 : root.totalLen) == expected.length(), "length mismatch");
        for (int i = 0; i < expected.length(); i++) {
            Errors.require(core.charAt(root, i) == expected.charAt(i), "char parity mismatch at " + i);
        }
    }
}
