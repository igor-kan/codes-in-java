package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.List;

public final class FastPath {
    private FastPath() {}

    public static Core mergeAll(List<Types.Interval> ranges) {
        Core tree = new Core();
        for (Types.Interval iv : ranges) {
            tree.addRange(iv.lo(), iv.hi());
        }
        return tree;
    }
}
