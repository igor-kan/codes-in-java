package com.igorkan.modules.vose_alias_sampler_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Types.AliasTable t = Core.build(new double[]{5.0, 5.0});
        if (new Core().sample(t, 1, 0.2) != 1) throw new AssertionError();
    }
}
