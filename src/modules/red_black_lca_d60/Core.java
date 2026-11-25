package com.igorkan.modules.red_black_lca_d60;

import java.util.*;

public final class Core implements Contract {
    private static final boolean RED = true, BLACK = false;
    private static final class Node {
        int key, sz = 1;
        boolean color = RED;
        Node left, right;
        Node(int k) { this.key = k; }
    }
    private Node root;
    private static boolean isRed(Node x) { return x != null && x.color == RED; }
    private static int sz(Node x) { return x == null ? 0 : x.sz; }
    private static Node rotLeft(Node h) {
        Node x = h.right; h.right = x.left; x.left = h;
        x.color = h.color; h.color = RED;
        x.sz = h.sz; h.sz = 1 + sz(h.left) + sz(h.right);
        return x;
    }
    private static Node rotRight(Node h) {
        Node x = h.left; h.left = x.right; x.right = h;
        x.color = h.color; h.color = RED;
        x.sz = h.sz; h.sz = 1 + sz(h.left) + sz(h.right);
        return x;
    }
    private static void flip(Node h) {
        h.color = !h.color; h.left.color = !h.left.color; h.right.color = !h.right.color;
    }
    public void insert(int key) { root = insertRec(root, key); root.color = BLACK; }
    private Node insertRec(Node h, int k) {
        if (h == null) return new Node(k);
        if (k < h.key) h.left = insertRec(h.left, k);
        else if (k > h.key) h.right = insertRec(h.right, k);
        if (isRed(h.right) && !isRed(h.left)) h = rotLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotRight(h);
        if (isRed(h.left) && isRed(h.right)) flip(h);
        h.sz = 1 + sz(h.left) + sz(h.right);
        return h;
    }
    @Override public int size() { return sz(root); }
    @Override public boolean contains(int key) {
        Node c = root;
        while (c != null) {
            if (key < c.key) c = c.left;
            else if (key > c.key) c = c.right;
            else return true;
        }
        return false;
    }
    @Override public int select(int rank) {
        Node c = root; int k = rank;
        while (c != null) {
            int ls = sz(c.left);
            if (k < ls) c = c.left;
            else if (k > ls) { k -= ls + 1; c = c.right; }
            else return c.key;
        }
        throw new IllegalArgumentException("rank out of range");
    }
}
