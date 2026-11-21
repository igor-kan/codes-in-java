package com.igorkan.modules.segment_tree_lazy_add_d56;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core st = new Core();
        st.init(6);
        st.rangeAdd(0, 5, 3);
        if (st.rangeSum(0, 5) != 18) throw new AssertionError("full range invariant failed");
    }
}
