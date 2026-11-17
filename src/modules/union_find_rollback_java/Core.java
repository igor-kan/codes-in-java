package com.igorkan.modules.union_find_rollback_java;

import java.util.ArrayList;
import java.util.List;

public final class Core implements Contract {
    private final int[] parent;
    private final int[] size;
    private final List<Types.UndoStep> history = new ArrayList<>();
    private int components;

    public Core(int n) {
        Validation.requirePositive(n);
        this.parent = new int[n];
        this.size = new int[n];
        this.components = n;
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }

    @Override
    public int find(int x) {
        Validation.requireVertex(parent.length, x);
        while (parent[x] != x) x = parent[x];
        return x;
    }

    @Override
    public boolean unite(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra == rb) return false;
        if (size[ra] < size[rb]) { int t = ra; ra = rb; rb = t; }
        history.add(new Types.UndoStep(rb, size[ra]));
        parent[rb] = ra;
        size[ra] += size[rb];
        components--;
        return true;
    }

    @Override
    public int snapshot() { return history.size(); }

    @Override
    public void rollback(int mark) {
        if (mark < 0 || mark > history.size()) {
            throw new Errors.RollbackDsuException(Errors.ErrorCode.OUT_OF_BOUNDS, "invalid rollback mark");
        }
        while (history.size() > mark) {
            Types.UndoStep st = history.remove(history.size() - 1);
            int child = st.child();
            int par = parent[child];
            size[par] = st.oldRootSize();
            parent[child] = child;
            components++;
        }
    }

    public int components() { return components; }
    public int vertexCount() { return parent.length; }
    public int componentSize(int x) { return size[find(x)]; }
}
