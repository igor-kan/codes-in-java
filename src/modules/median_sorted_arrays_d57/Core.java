package com.igorkan.modules.median_sorted_arrays_d57;

import java.util.*;

public final class Core implements Contract {
    @Override
    public double findMedianSorted(int[] a, int[] b) {
        if (a.length > b.length) return findMedianSorted(b, a);
        int m = a.length, n = b.length;
        int half = (m + n + 1) / 2;
        int lo = 0, hi = m;
        while (lo <= hi) {
            int i = (lo + hi) >>> 1;
            int j = half - i;
            int aLeft = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int aRight = (i == m) ? Integer.MAX_VALUE : a[i];
            int bLeft = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int bRight = (j == n) ? Integer.MAX_VALUE : b[j];
            if (aLeft <= bRight && bLeft <= aRight) {
                if (((m + n) & 1) == 1) return Math.max(aLeft, bLeft);
                return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
            }
            if (aLeft > bRight) hi = i - 1;
            else lo = i + 1;
        }
        throw new IllegalArgumentException("unsorted inputs");
    }
}
