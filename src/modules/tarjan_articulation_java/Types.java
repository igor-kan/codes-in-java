package com.igorkan.modules.tarjan_articulation_java;

public final class Types {
    private Types() {}
    public record CutReport(boolean[] isArticulation, int bridges) {}
}
