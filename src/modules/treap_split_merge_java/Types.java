package com.igorkan.modules.treap_split_merge_java;

public final class Types {
    public static final class Node {
        public final int key;
        public final long priority;
        public int size = 1;
        public Node left, right;
        public Node(int key, long priority) { this.key = key; this.priority = priority; }
    }
}
