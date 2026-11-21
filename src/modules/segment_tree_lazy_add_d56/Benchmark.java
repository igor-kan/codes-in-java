package com.igorkan.modules.segment_tree_lazy_add_d56;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core st = new Core(); st.init(16); st.rangeAdd(0, 15, 2);
        for (int it = 0; it < 200; it++) sink += st.rangeSum(2, 12);
        long ns = System.nanoTime() - t0;
        System.out.println("segment_tree_lazy_add_d56 ns=" + ns + " sink=" + sink);
    }
}
