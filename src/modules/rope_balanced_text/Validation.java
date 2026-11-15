package com.igorkan.modules.rope_balanced_text;

public final class Validation {
    private Validation() {}

    public static void verifyWeights(Types.RopeNode n) {
        if (n == null || n.isLeaf()) return;
        Errors.require(n.leftWeight == n.left.totalLen, "corrupt leftWeight");
        Errors.require(n.totalLen == n.left.totalLen + n.right.totalLen, "corrupt totalLen");
        verifyWeights(n.left);
        verifyWeights(n.right);
    }
}
