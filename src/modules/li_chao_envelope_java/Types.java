package com.igorkan.modules.li_chao_envelope_java;

public final class Types {
    private Types() {}
    public record Line(long m, long b) { public long eval(long x) { return m * x + b; } }
}
