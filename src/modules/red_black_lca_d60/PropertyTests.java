package com.igorkan.modules.red_black_lca_d60;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core t = new Core();
        for (int i = 20; i >= 1; --i) t.insert(i * 3);
        for (int r = 0; r < 20; ++r) {
            if (t.select(r) != (r + 1) * 3) throw new AssertionError("order mismatch");
        }
    }
}
