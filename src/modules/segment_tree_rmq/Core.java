package com.igorkan.modules.segment_tree_rmq;

public final class Core implements Contract {
    public final int n;
    public final long[] tree;
    public final long[] lazy;

    public Core(long[] init) {
        this.n = init.length;
        this.tree = new long[4 * Math.max(1, n)];
        this.lazy = new long[4 * Math.max(1, n)];
        if (n > 0) build(1, 0, n - 1, init);
    }

    private void build(int node, int l, int r, long[] init) {
        if (l == r) { tree[node] = init[l]; return; }
        int m = (l + r) >>> 1;
        build(node * 2, l, m, init);
        build(node * 2 + 1, m + 1, r, init);
        tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    private void push(int node) {
        if (lazy[node] != 0L) {
            long d = lazy[node];
            tree[node * 2] += d;
            lazy[node * 2] += d;
            tree[node * 2 + 1] += d;
            lazy[node * 2 + 1] += d;
            lazy[node] = 0L;
        }
    }

    @Override
    public void rangeAdd(int l, int r, long delta) {
        updateRec(1, 0, n - 1, l, r, delta);
    }

    private void updateRec(int node, int l, int r, int ql, int qr, long delta) {
        if (ql <= l && r <= qr) {
            tree[node] += delta;
            lazy[node] += delta;
            return;
        }
        push(node);
        int m = (l + r) >>> 1;
        if (ql <= m) updateRec(node * 2, l, m, ql, qr, delta);
        if (qr > m)  updateRec(node * 2 + 1, m + 1, r, ql, qr, delta);
        tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    @Override
    public long rangeMin(int l, int r) {
        return queryRec(1, 0, n - 1, l, r);
    }

    private long queryRec(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) return tree[node];
        push(node);
        int m = (l + r) >>> 1;
        long ans = Long.MAX_VALUE;
        if (ql <= m) ans = Math.min(ans, queryRec(node * 2, l, m, ql, qr));
        if (qr > m)  ans = Math.min(ans, queryRec(node * 2 + 1, m + 1, r, ql, qr));
        return ans;
    }
}
