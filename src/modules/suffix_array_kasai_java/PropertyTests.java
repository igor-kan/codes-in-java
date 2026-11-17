package com.igorkan.modules.suffix_array_kasai_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        var cnts = Concurrent.parallelPatternCounts(List.of("mississippi", "ississ"), "issi");
        if (!cnts.equals(List.of(2, 1))) throw new AssertionError("unexpected counts: " + cnts);
    }
}
