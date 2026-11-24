package com.igorkan.modules.rabin_karp_java_d59;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int indexOfRolling(String text, String pat) {
        int n = text.length(), m = pat.length();
        if (m == 0) return 0;
        if (m > n) return -1;
        long base = 257L, mod = Types.MOD, pow = 1L;
        for (int i = 0; i < m - 1; i++) pow = (pow * base) % mod;
        long ph = 0, th = 0;
        for (int i = 0; i < m; i++) {
            ph = (ph * base + pat.charAt(i)) % mod;
            th = (th * base + text.charAt(i)) % mod;
        }
        for (int i = 0; i <= n - m; i++) {
            if (th == ph && text.regionMatches(i, pat, 0, m)) return i;
            if (i < n - m) {
                th = ((th - text.charAt(i) * pow) % mod + mod) % mod;
                th = (th * base + text.charAt(i + m)) % mod;
            }
        }
        return -1;
    }
}
