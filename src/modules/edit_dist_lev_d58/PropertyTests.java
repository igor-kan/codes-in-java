package com.igorkan.modules.edit_dist_lev_d58;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        if (c.editDistance("alpha", "beta") != c.editDistance("beta", "alpha")) throw new AssertionError();
    }
}
