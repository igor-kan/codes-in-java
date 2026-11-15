package com.igorkan.modules.bplus_order_map;

import java.util.HashSet;
import java.util.Set;

public final class Validation {
    private Validation() {}

    public static void verifyUniformDepth(Types.BNode root) {
        Set<Integer> depths = new HashSet<>();
        collectDepths(root, 0, depths);
        Errors.require(depths.size() == 1, "non-uniform B+ leaf depths");
    }

    private static void collectDepths(Types.BNode n, int d, Set<Integer> depths) {
        if (n instanceof Types.Leaf) { depths.add(d); return; }
        for (Types.BNode c : ((Types.Internal) n).children) collectDepths(c, d + 1, depths);
    }
}
