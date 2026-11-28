package com.igorkan.modules.binary_lifting_lca_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        Types.LcaTable chain = c.build(new int[]{0, 0, 1, 2, 3});
        if (chain.depth().length != 5) throw new AssertionError("size");
        if (c.lca(chain, 4, 3) != 3 || c.lca(chain, 4, 1) != 1 || c.lca(chain, 2, 2) != 2) {
            throw new AssertionError("chain");
        }
        Types.LcaTable tree = c.build(new int[]{0, 0, 0, 1, 1, 2, 2});
        if (c.lca(tree, 3, 4) != 1 || c.lca(tree, 3, 5) != 0 || c.lca(tree, 5, 6) != 2) {
            throw new AssertionError("tree");
        }
        Invariants.ensure(true, "unit ok");
    }
}
