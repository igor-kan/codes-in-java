package com.igorkan.modules.kmp_stream_matcher_java;

import java.util.*;

public final class Core implements Contract {
    @Override
    public List<Integer> findAll(String text, String pat) {
        int m = pat.length();
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && pat.charAt(i) != pat.charAt(j)) j = pi[j - 1];
            if (pat.charAt(i) == pat.charAt(j)) j++;
            pi[i] = j;
        }
        List<Integer> out = new ArrayList<>();
        for (int i = 0, j = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pat.charAt(j)) j = pi[j - 1];
            if (text.charAt(i) == pat.charAt(j)) j++;
            if (j == m) { out.add(i - m + 1); j = pi[j - 1]; }
        }
        return out;
    }
}
