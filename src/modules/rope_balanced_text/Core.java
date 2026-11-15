package com.igorkan.modules.rope_balanced_text;

public final class Core implements Contract {
    @Override
    public Types.RopeNode concat(Types.RopeNode a, Types.RopeNode b) {
        if (a == null || a.totalLen == 0) return b;
        if (b == null || b.totalLen == 0) return a;
        return new Types.RopeNode(a, b);
    }

    @Override
    public char charAt(Types.RopeNode root, int index) {
        Errors.require(root != null && index >= 0 && index < root.totalLen, "rope index out of bounds");
        Types.RopeNode cur = root;
        int idx = index;
        while (!cur.isLeaf()) {
            if (idx < cur.leftWeight) {
                cur = cur.left;
            } else {
                idx -= cur.leftWeight;
                cur = cur.right;
            }
        }
        return cur.text.charAt(idx);
    }

    @Override
    public Types.RopeNode[] split(Types.RopeNode root, int index) {
        if (root == null) return new Types.RopeNode[]{null, null};
        if (index <= 0) return new Types.RopeNode[]{null, root};
        if (index >= root.totalLen) return new Types.RopeNode[]{root, null};
        if (root.isLeaf()) {
            return new Types.RopeNode[]{
                new Types.RopeNode(root.text.substring(0, index)),
                new Types.RopeNode(root.text.substring(index))
            };
        }
        if (index <= root.leftWeight) {
            Types.RopeNode[] sub = split(root.left, index);
            return new Types.RopeNode[]{sub[0], concat(sub[1], root.right)};
        } else {
            Types.RopeNode[] sub = split(root.right, index - root.leftWeight);
            return new Types.RopeNode[]{concat(root.left, sub[0]), sub[1]};
        }
    }
}
