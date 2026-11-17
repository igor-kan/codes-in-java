package com.igorkan.modules.dual_fenwick_range_java;

import java.util.List;

public final class FastPath {
    public static void applyOps(Core df, List<Types.RangeOp> ops) {
        for (var op : ops) df.rangeAdd(op.lo(), op.hi(), op.delta());
    }
}
