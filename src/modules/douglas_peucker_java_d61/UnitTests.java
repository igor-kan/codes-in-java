package com.igorkan.modules.douglas_peucker_java_d61;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core c = new Core();
        Types.Pt[] line = {
            new Types.Pt(0.0, 0.0),
            new Types.Pt(1.0, 0.1),
            new Types.Pt(2.0, 0.0),
            new Types.Pt(3.0, 1.0),
            new Types.Pt(4.0, 0.0)
        };
        Types.Pt[] simp = c.simplify(line, 0.7);
        if (simp.length != 3 || simp[1].x() != 3.0) throw new AssertionError("simplify");
        double d = c.perpendicularDistance(new Types.Pt(0.0, 2.0), new Types.Pt(0.0, 0.0), new Types.Pt(0.0, 0.0));
        if (d != 2.0) throw new AssertionError("degenerate");
        Invariants.ensure(true, "unit ok");
    }
}
