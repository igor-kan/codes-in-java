package com.igorkan.modules.manacher_longest_palin_java;

public final class Types {
    public record PalinResult(String longest, int start, int length, long totalSubstrings) {}
}
