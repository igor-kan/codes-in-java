package com.igorkan.modules.rope_balanced_text;

public final class FastPath {
    private FastPath() {}

    public static String flatten(Types.RopeNode root) {
        StringBuilder sb = new StringBuilder(root == null ? 0 : root.totalLen);
        appendRec(root, sb);
        return sb.toString();
    }

    private static void appendRec(Types.RopeNode n, StringBuilder sb) {
        if (n == null) return;
        if (n.isLeaf()) { sb.append(n.text); return; }
        appendRec(n.left, sb);
        appendRec(n.right, sb);
    }
}
