package com.igorkan.modules.dinic_maxflow_scaling_java;

public final class Types {
    private Types() {}
    public record EdgeSpec(int u, int v, long cap) {}
}
