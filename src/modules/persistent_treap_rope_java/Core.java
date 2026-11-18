package com.igorkan.modules.persistent_treap_rope_java;

import java.util.*;

public final class Core implements Contract {
    public static int size(Types.Node n) { return n == null ? 0 : n.sz(); }
    public static long sum(Types.Node n) { return n == null ? 0L : n.sum(); }
    public static Types.Node make(long val, int prio, Types.Node l, Types.Node r) {
        return new Types.Node(val, val + sum(l) + sum(r), prio, 1 + size(l) + size(r), l, r);
    }
    public static Types.Node[] split(Types.Node u, int k) {
        if (u == null) return new Types.Node[]{null, null};
        int lsz = size(u.l());
        if (k <= lsz) {
            Types.Node[] p = split(u.l(), k);
            return new Types.Node[]{p[0], make(u.val(), u.prio(), p[1], u.r())};
        } else {
            Types.Node[] p = split(u.r(), k - lsz - 1);
            return new Types.Node[]{make(u.val(), u.prio(), u.l(), p[0]), p[1]};
        }
    }
    public static Types.Node merge(Types.Node a, Types.Node b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.prio() > b.prio()) return make(a.val(), a.prio(), a.l(), merge(a.r(), b));
        return make(b.val(), b.prio(), merge(a, b.l()), b.r());
    }
    @Override
    public long sumOf(Types.Node root) { return sum(root); }
}
