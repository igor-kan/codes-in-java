package com.igorkan.modules.li_chao_envelope_java;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        var lns = List.of(new Types.Line(2, 10), new Types.Line(-1, 50), new Types.Line(0, 25));
        if (c.queryMin(64, lns, 5) != 20L || c.queryMin(64, lns, 40) != 10L) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
