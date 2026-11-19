package com.igorkan.modules.tarjan_articulation_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        var rep = new Core().analyze(5, new int[][]{{0,1},{1,2},{2,0},{2,3},{3,4}});
        if (!rep.isArticulation()[2] || !rep.isArticulation()[3] || rep.bridges() != 2) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
