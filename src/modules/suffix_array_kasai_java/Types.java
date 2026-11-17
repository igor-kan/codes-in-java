package com.igorkan.modules.suffix_array_kasai_java;

public final class Types {
    public record SuffixIndex(String text, int[] sa, int[] lcp) {}
}
