package com.igorkan.modules.treap_split_merge_java;

public final class Invariants {
    public static void verifyTreap(Types.Node n) {
        if (n == null) return;
        int sz = 1;
        if (n.left != null) {
            if (n.left.key >= n.key || n.left.priority > n.priority) throw new AssertionError("left treap violation");
            sz += n.left.size;
            verifyTreap(n.left);
        }
        if (n.right != null) {
            if (n.right.key <= n.key || n.right.priority > n.priority) throw new AssertionError("right treap violation");
            sz += n.right.size;
            verifyTreap(n.right);
        }
        if (sz != n.size) throw new AssertionError("subtree size mismatch");
    }
}
