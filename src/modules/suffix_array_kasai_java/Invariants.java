package com.igorkan.modules.suffix_array_kasai_java;

public final class Invariants {
    public static void verifySaAndLcp(Types.SuffixIndex idx) {
        String s = idx.text();
        int[] sa = idx.sa();
        int[] lcp = idx.lcp();
        for (int i = 1; i < sa.length; i++) {
            String prev = s.substring(sa[i - 1]);
            String cur = s.substring(sa[i]);
            if (prev.compareTo(cur) >= 0) throw new AssertionError("SA ordering violation at " + i);
            int pref = 0;
            while (pref < prev.length() && pref < cur.length() && prev.charAt(pref) == cur.charAt(pref)) pref++;
            if (lcp[i] != pref) throw new AssertionError("LCP mismatch at " + i);
        }
    }
}
