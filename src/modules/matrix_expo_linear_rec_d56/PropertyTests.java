package com.igorkan.modules.matrix_expo_linear_rec_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if ((c.fibMod(12) + c.fibMod(13)) % Types.MOD != c.fibMod(14)) throw new AssertionError();
    }
}
