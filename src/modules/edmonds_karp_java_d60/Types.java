package com.igorkan.modules.edmonds_karp_java_d60;

public final class Types {
    private Types() {}
    public record FlowEdge(int u, int v, long cap) {}
}
