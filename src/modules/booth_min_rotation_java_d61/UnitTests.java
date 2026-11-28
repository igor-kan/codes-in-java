package com.igorkan.modules.booth_min_rotation_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        String[][] cases = {
            {"baaa", "1", "aaab"},
            {"cba", "2", "acb"},
            {"banana", "5", "abanan"},
            {"aaaa", "0", "aaaa"},
            {"abcd", "0", "abcd"},
            {"", "0", ""}
        };
        for (String[] tc : cases) {
            int start = c.leastRotation(tc[0]);
            if (start != Integer.parseInt(tc[1])) throw new AssertionError("start " + tc[0]);
            if (!c.minimalRotation(tc[0]).equals(tc[2])) throw new AssertionError("rotation " + tc[0]);
        }
        var info = c.rotationInfo("banana");
        if (info.start() != 5 || !info.text().equals("abanan")) throw new AssertionError("info");
        if (!c.minimalRotation("").isEmpty()) throw new AssertionError("empty");
        Invariants.ensure(true, "unit ok");
    }
}
