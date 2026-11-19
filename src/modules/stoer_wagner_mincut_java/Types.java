package com.igorkan.modules.stoer_wagner_mincut_java;

public final class Types {
    private Types() {}
    public record CutSummary(long minCut, int phases) {}
}
