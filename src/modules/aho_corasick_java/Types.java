package com.igorkan.modules.aho_corasick_java;

import java.util.ArrayList;
import java.util.List;

public final class Types {
    private Types() {}

    public record Match(int startOffset, int patternId) {}

    public static final class AcNode {
        public final int[] next = new int[128];
        public int fail = 0;
        public final List<Integer> outputs = new ArrayList<>();
    }
}
