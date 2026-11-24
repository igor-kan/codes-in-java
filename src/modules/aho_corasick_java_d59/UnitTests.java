package com.igorkan.modules.aho_corasick_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.countMultiHits(new String[]{"he", "she", "hers", "his"}, "ahishers") != 4) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
