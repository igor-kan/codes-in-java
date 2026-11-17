package com.igorkan.modules.manacher_longest_palin_java;

public final class Invariants {
    public static void verifyMatchesBrute(String s, Types.PalinResult got) {
        if (!FastPath.isPalindromeSlice(s, got.start(), got.start() + got.length())) {
            throw new AssertionError("returned slice is not a palindrome");
        }
        long cnt = 0;
        int best = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (FastPath.isPalindromeSlice(s, i, j)) {
                    cnt++;
                    best = Math.max(best, j - i);
                }
            }
        }
        if (got.length() != best || got.totalSubstrings() != cnt) {
            throw new AssertionError("Manacher output disagreed with brute oracle");
        }
    }
}
