package com.igorkan.modules.li_chao_envelope_java;

import java.util.*;

public final class Core implements Contract {
    private Types.Line[] tree;
    private void insert(int v, int l, int r, Types.Line nw) {
        int mid = (l + r) >>> 1;
        boolean lBetter = nw.eval(l) < tree[v].eval(l);
        boolean mBetter = nw.eval(mid) < tree[v].eval(mid);
        if (mBetter) { Types.Line tmp = tree[v]; tree[v] = nw; nw = tmp; }
        if (l == r) return;
        if (lBetter != mBetter) insert(v << 1, l, mid, nw);
        else insert(v << 1 | 1, mid + 1, r, nw);
    }
    private long query(int v, int l, int r, int x) {
        long res = tree[v].eval(x);
        if (l == r) return res;
        int mid = (l + r) >>> 1;
        if (x <= mid) return Math.min(res, query(v << 1, l, mid, x));
        return Math.min(res, query(v << 1 | 1, mid + 1, r, x));
    }
    @Override
    public long queryMin(int domain, List<Types.Line> lines, int x) {
        tree = new Types.Line[4 * domain + 4];
        Arrays.fill(tree, new Types.Line(0L, Long.MAX_VALUE / 4));
        for (var ln : lines) insert(1, 0, domain - 1, ln);
        return query(1, 0, domain - 1, x);
    }
}
