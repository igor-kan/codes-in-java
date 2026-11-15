package com.igorkan.modules.bplus_order_map;

import java.util.ArrayList;
import java.util.List;

public final class Core implements Contract {
    public final int order;
    public Types.BNode root = new Types.Leaf();

    public Core(int order) {
        Errors.require(order >= 3, "B+ order must be >= 3");
        this.order = order;
    }

    public Types.Leaf findLeaf(long key) {
        Types.BNode cur = root;
        while (cur instanceof Types.Internal inter) {
            int i = 0;
            while (i < inter.keys.size() && key >= inter.keys.get(i)) i++;
            cur = inter.children.get(i);
        }
        return (Types.Leaf) cur;
    }

    @Override
    public String get(long key) {
        Types.Leaf leaf = findLeaf(key);
        int idx = leaf.keys.indexOf(key);
        return idx >= 0 ? leaf.vals.get(idx) : null;
    }

    @Override
    public List<String> rangeScan(long lo, long hi) {
        List<String> res = new ArrayList<>();
        Types.Leaf cur = findLeaf(lo);
        while (cur != null) {
            for (int i = 0; i < cur.keys.size(); i++) {
                long k = cur.keys.get(i);
                if (k > hi) return res;
                if (k >= lo) res.add(cur.vals.get(i));
            }
            cur = cur.next;
        }
        return res;
    }

    @Override
    public void put(long key, String val) {
        Types.SplitUp sp = insertRec(root, key, val);
        if (sp != null) {
            Types.Internal nr = new Types.Internal();
            nr.keys.add(sp.promoKey());
            nr.children.add(root);
            nr.children.add(sp.right());
            root = nr;
        }
    }

    private Types.SplitUp insertRec(Types.BNode node, long key, String val) {
        if (node instanceof Types.Leaf leaf) {
            int i = 0;
            while (i < leaf.keys.size() && leaf.keys.get(i) < key) i++;
            if (i < leaf.keys.size() && leaf.keys.get(i) == key) {
                leaf.vals.set(i, val);
                return null;
            }
            leaf.keys.add(i, key);
            leaf.vals.add(i, val);
            if (leaf.keys.size() < order) return null;
            int mid = leaf.keys.size() / 2;
            Types.Leaf right = new Types.Leaf();
            right.keys.addAll(leaf.keys.subList(mid, leaf.keys.size()));
            right.vals.addAll(leaf.vals.subList(mid, leaf.vals.size()));
            leaf.keys.subList(mid, leaf.keys.size()).clear();
            leaf.vals.subList(mid, leaf.vals.size()).clear();
            right.next = leaf.next;
            leaf.next = right;
            return new Types.SplitUp(right.keys.get(0), right);
        }
        Types.Internal inter = (Types.Internal) node;
        int i = 0;
        while (i < inter.keys.size() && key >= inter.keys.get(i)) i++;
        Types.SplitUp childSp = insertRec(inter.children.get(i), key, val);
        if (childSp == null) return null;
        inter.keys.add(i, childSp.promoKey());
        inter.children.add(i + 1, childSp.right());
        if (inter.keys.size() < order) return null;
        int mid = inter.keys.size() / 2;
        long up = inter.keys.get(mid);
        Types.Internal right = new Types.Internal();
        right.keys.addAll(inter.keys.subList(mid + 1, inter.keys.size()));
        right.children.addAll(inter.children.subList(mid + 1, inter.children.size()));
        inter.keys.subList(mid, inter.keys.size()).clear();
        inter.children.subList(mid + 1, inter.children.size()).clear();
        return new Types.SplitUp(up, right);
    }
}
