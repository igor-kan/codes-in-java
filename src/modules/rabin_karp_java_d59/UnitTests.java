package com.igorkan.modules.rabin_karp_java_d59;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        if (c.indexOfRolling("abracadabra", "cad") != 4 || c.indexOfRolling("hello", "xyz") != -1) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
