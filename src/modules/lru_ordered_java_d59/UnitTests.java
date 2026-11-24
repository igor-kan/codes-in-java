package com.igorkan.modules.lru_ordered_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core(); c.init(2);
        c.put(1, 10); c.put(2, 20);
        if (c.get(1) != 10) throw new AssertionError();
        c.put(3, 30);
        if (c.get(2) != -1 || c.get(3) != 30) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
