package com.igorkan.modules.aho_corasick_java;

import java.util.List;

public final class Validation {
    private Validation() {}

    public static void validatePatterns(List<String> patterns) {
        Errors.require(patterns != null && !patterns.isEmpty(), "patterns empty");
        for (String p : patterns) {
            Errors.require(p != null && !p.isEmpty(), "individual pattern cannot be empty");
        }
    }
}
