package com.igorkan.modules.bplus_order_map;

import java.util.ArrayList;
import java.util.List;

public final class Concurrent {
    private Concurrent() {}

    public static List<List<String>> parallelRanges(Core tree, List<long[]> bounds) {
        List<List<String>> out = new ArrayList<>();
        for (long[] b : bounds) out.add(tree.rangeScan(b[0], b[1]));
        return out;
    }
}
