package com.igorkan.modules.persistent_treap_rope_java;

public final class Types {
    private Types() {}
    public record Node(long val, long sum, int prio, int sz, Node l, Node r) {}
}
