package com.igorkan.modules.li_chao_envelope_java;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.queryMin(32, List.of(new Types.Line(3, 1), new Types.Line(1, 10)), 2) != 7L) throw new AssertionError();
    }
}
