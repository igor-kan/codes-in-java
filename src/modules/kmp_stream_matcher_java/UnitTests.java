package com.igorkan.modules.kmp_stream_matcher_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        if (!new Core().findAll("ababaababa", "aba").equals(List.of(0, 2, 5, 7))) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
