package com.igorkan.modules.douglas_peucker_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        Types.Pt[] base = new Types.Pt[50];
        for (int i = 0; i < base.length; ++i) base[i] = new Types.Pt(i, 2.0 * i);
        if (c.simplify(base, 0.001).length != 2) throw new AssertionError("collinear");
        Types.Pt[] curve = new Types.Pt[64];
        for (int i = 0; i < curve.length; ++i) curve[i] = new Types.Pt(i, ((i * i) % 17) / 4.0);
        Types.Pt[] out = c.simplify(curve, 0.25);
        if (out.length < 2 || !out[0].equals(curve[0]) || !out[out.length - 1].equals(curve[curve.length - 1])) {
            throw new AssertionError("endpoints");
        }
        if (out.length > curve.length) throw new AssertionError("growth");
        Types.Pt[] again = c.simplify(out, 0.25);
        if (again.length > out.length) throw new AssertionError("non-monotone");
    }
}
