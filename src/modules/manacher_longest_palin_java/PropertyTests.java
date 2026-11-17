package com.igorkan.modules.manacher_longest_palin_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long tot = Concurrent.parallelTotalPalindromes(List.of("aba", "racecar", "abba"));
        if (tot != 4 + 10 + 6) throw new AssertionError("unexpected palindrome count sum: " + tot);
    }
}
