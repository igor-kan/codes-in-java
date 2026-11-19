package com.igorkan.modules.stoer_wagner_mincut_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        long[][] g = {{0,2,0,0,3},{2,0,3,0,2},{0,3,0,4,0},{0,0,4,0,1},{3,2,0,1,0}};
        var res = new Core().globalMinCut(g);
        if (res.minCut() != 4L) throw new AssertionError("expected 4, got " + res.minCut());
        Invariants.ensure(true, "unit ok");
    }
}
