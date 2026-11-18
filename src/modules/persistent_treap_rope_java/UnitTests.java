package com.igorkan.modules.persistent_treap_rope_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Types.Node r0 = null;
        for (int i = 1; i <= 5; i++) r0 = Core.merge(r0, Core.make(i * 10L, i * 1664525, null, null));
        Types.Node[] sp = Core.split(r0, 2);
        Types.Node r1 = Core.merge(sp[0], Core.merge(Core.make(99L, 9999999, null, null), sp[1]));
        if (Core.sum(r0) != 150L || Core.sum(r1) != 249L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
