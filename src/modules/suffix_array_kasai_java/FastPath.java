package com.igorkan.modules.suffix_array_kasai_java;

public final class FastPath {
    public static int countOccurrences(Types.SuffixIndex idx, String pat) {
        int lo = lowerBound(idx, pat, false);
        int hi = lowerBound(idx, pat, true);
        return Math.max(0, hi - lo);
    }

    private static int lowerBound(Types.SuffixIndex idx, String pat, boolean upper) {
        String s = idx.text();
        int[] sa = idx.sa();
        int l = 0, r = sa.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            int off = sa[mid];
            int cmp = comparePrefix(s, off, pat);
            if (cmp < 0 || (upper && cmp == 0)) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    private static int comparePrefix(String s, int off, String pat) {
        int len = Math.min(pat.length(), s.length() - off);
        for (int i = 0; i < len; i++) {
            if (s.charAt(off + i) != pat.charAt(i)) return Character.compare(s.charAt(off + i), pat.charAt(i));
        }
        return len < pat.length() ? -1 : 0;
    }
}
