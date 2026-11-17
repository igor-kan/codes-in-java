package com.igorkan.modules.suffix_array_kasai_java;

public final class UnitTests {
    public static void main(String[] args) {
        var idx = new Core().build("banana$");
        Invariants.verifySaAndLcp(idx);
        if (FastPath.countOccurrences(idx, "ana") != 2) throw new AssertionError("expected 2 ana hits");
        if (FastPath.countOccurrences(idx, "xyz") != 0) throw new AssertionError("expected 0 xyz hits");
    }
}
