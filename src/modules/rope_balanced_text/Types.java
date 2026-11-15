package com.igorkan.modules.rope_balanced_text;

public final class Types {
    private Types() {}

    public static final class RopeNode {
        public final String text;
        public final int totalLen;
        public final int leftWeight;
        public final RopeNode left;
        public final RopeNode right;

        public RopeNode(String text) {
            this.text = text;
            this.totalLen = text.length();
            this.leftWeight = text.length();
            this.left = null;
            this.right = null;
        }

        public RopeNode(RopeNode left, RopeNode right) {
            this.text = null;
            this.left = left;
            this.right = right;
            this.leftWeight = left.totalLen;
            this.totalLen = left.totalLen + right.totalLen;
        }

        public boolean isLeaf() {
            return text != null;
        }
    }
}
