package com.igorkan.modules.segment_tree_lazy_add_d56;

import java.util.*;

public final class Core implements Contract {
    private int n;
    private long[] tree;
    private long[] lazy;

    public void init(int size) {
        this.n = size;
        this.tree = new long[4 * size + 4];
        this.lazy = new long[4 * size + 4];
    }

    private void push(int node, int l, int r) {
        if (lazy[node] != 0) {
            int mid = (l + r) >>> 1;
            long val = lazy[node];
            tree[node * 2] += val * (mid - l + 1);
            lazy[node * 2] += val;
            tree[node * 2 + 1] += val * (r - mid);
            lazy[node * 2 + 1] += val;
            lazy[node] = 0;
        }
    }

    public void rangeAdd(int ql, int qr, long v) { update(1, 0, n - 1, ql, qr, v); }

    private void update(int node, int l, int r, int ql, int qr, long v) {
        if (ql > r || qr < l) return;
        if (ql <= l && r <= qr) {
            tree[node] += v * (r - l + 1);
            lazy[node] += v;
            return;
        }
        push(node, l, r);
        int mid = (l + r) >>> 1;
        update(node * 2, l, mid, ql, qr, v);
        update(node * 2 + 1, mid + 1, r, ql, qr, v);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    @Override
    public long rangeSum(int ql, int qr) { return query(1, 0, n - 1, ql, qr); }

    private long query(int node, int l, int r, int ql, int qr) {
        if (ql > r || qr < l) return 0;
        if (ql <= l && r <= qr) return tree[node];
        push(node, l, r);
        int mid = (l + r) >>> 1;
        return query(node * 2, l, mid, ql, qr) + query(node * 2 + 1, mid + 1, r, ql, qr);
    }
}
