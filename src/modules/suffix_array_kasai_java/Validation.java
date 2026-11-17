package com.igorkan.modules.suffix_array_kasai_java;

public final class Validation {
    public static void requireNonEmpty(String s) {
        if (s == null || s.isEmpty()) {
            throw new Errors.SuffixArrayException(Errors.ErrorCode.EMPTY_INPUT, "text cannot be empty");
        }
    }
}
