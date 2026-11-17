package com.igorkan.modules.treap_split_merge_java;

import java.util.ArrayList;
import java.util.List;

public final class FastPath {
    public static List<Integer> toSortedList(Core treap) {
        List<Integer> out = new ArrayList<>(treap.size());
        collect(treap.rootNode(), out);
        return out;
    }
    private static void collect(Types.Node n, List<Integer> out) {
        if (n == null) return;
        collect(n.left, out);
        out.add(n.key);
        collect(n.right, out);
    }
}
