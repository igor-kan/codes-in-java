package com.igorkan.modules.word_break_trie_dp_d57;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int minWordSegments(String s, String[] dict) {
        Set<String> words = new HashSet<>(Arrays.asList(dict));
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Types.UNREACHABLE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] < Types.UNREACHABLE && words.contains(s.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n] >= Types.UNREACHABLE ? -1 : dp[n];
    }
}
