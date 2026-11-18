package com.igorkan.modules.vose_alias_sampler_java;

public final class Types {
    private Types() {}
    public record AliasTable(double[] prob, int[] alias) {}
}
