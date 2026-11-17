package com.igorkan.modules.manacher_longest_palin_java;

public final class FastPath {
    public static boolean isPalindromeSlice(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo++) != s.charAt(--hi)) return false;
        }
        return true;
    }
}
