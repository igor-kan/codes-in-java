package com.igorkan.modules.segment_tree_lazy_add_d56;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core st = new Core();
        st.init(8);
        st.rangeAdd(1, 5, 10);
        st.rangeAdd(3, 6, 4);
        if (st.rangeSum(1, 6) != 66 || st.rangeSum(2, 4) != 38) throw new AssertionError("lazy sum bad");
        Invariants.ensure(true, "unit ok");
    }
}
