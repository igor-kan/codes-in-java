package com.igorkan.modules.binary_lifting_lca_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[] parent = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        Types.LcaTable table = c.build(parent);
        int n = parent.length;
        for (int a = 0; a < n; ++a) {
            if (c.lca(table, a, a) != a) throw new AssertionError("self");
            for (int b = 0; b < n; ++b) {
                int l = c.lca(table, a, b);
                if (l != c.lca(table, b, a)) throw new AssertionError("symmetry");
                if (table.depth()[l] > table.depth()[a] || table.depth()[l] > table.depth()[b]) {
                    throw new AssertionError("depth");
                }
                if (c.lca(table, l, a) != l || c.lca(table, l, b) != l) throw new AssertionError("ancestor");
            }
        }
    }
}
