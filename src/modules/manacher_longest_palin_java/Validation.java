package com.igorkan.modules.manacher_longest_palin_java;

public final class Validation {
    public static void requireNonEmpty(String s) {
        if (s == null || s.isEmpty()) {
            throw new Errors.ManacherException(Errors.ErrorCode.EMPTY_INPUT, "string cannot be null or empty");
        }
    }
}
