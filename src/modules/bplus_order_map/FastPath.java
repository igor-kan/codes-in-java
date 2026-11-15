package com.igorkan.modules.bplus_order_map;

public final class FastPath {
    private FastPath() {}

    public static Types.Leaf leftmost(Types.BNode root) {
        Types.BNode cur = root;
        while (cur instanceof Types.Internal inter) cur = inter.children.get(0);
        return (Types.Leaf) cur;
    }
}
