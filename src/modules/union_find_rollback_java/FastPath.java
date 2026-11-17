package com.igorkan.modules.union_find_rollback_java;

import java.util.List;

public final class FastPath {
    public static void uniteAll(Core dsu, List<int[]> edges) {
        for (int[] e : edges) dsu.unite(e[0], e[1]);
    }
}
