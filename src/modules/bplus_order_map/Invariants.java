package com.igorkan.modules.bplus_order_map;

import java.util.ArrayList;
import java.util.List;

public final class Invariants {
    private Invariants() {}

    public static List<Long> collectLeafKeys(Types.BNode root) {
        List<Long> keys = new ArrayList<>();
        Types.Leaf cur = FastPath.leftmost(root);
        long prev = Long.MIN_VALUE;
        while (cur != null) {
            for (long k : cur.keys) {
                Errors.require(k > prev, "leaf chain unsorted");
                prev = k;
                keys.add(k);
            }
            cur = cur.next;
        }
        return keys;
    }
}
