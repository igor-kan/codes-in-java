package com.igorkan.modules.myers_bit_edit_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        String[][] pairs = {
            {"kitten", "sitting"},
            {"flaw", "lawn"},
            {"intention", "execution"},
            {"aaaa", "aa"},
            {"abc", ""}
        };
        for (String[] pr : pairs) {
            String a = pr[0];
            String b = pr[1];
            int n = a.length();
            int m = b.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i <= n; ++i) dp[i][0] = i;
            for (int j = 0; j <= m; ++j) dp[0][j] = j;
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= m; ++j) {
                    int cost = a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1;
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost));
                }
            }
            if (c.distance(a, b) != dp[n][m]) throw new AssertionError("distance mismatch");
            if (c.distance(a, b) != c.distance(b, a)) throw new AssertionError("symmetry");
        }
    }
}
