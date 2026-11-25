package com.igorkan.modules.mergesort_inversions_d60;

import java.util.*;

public final class Core implements Contract {
    private long sortCount(int[] a, int[] tmp, int l, int r) {
        if (r - l <= 1) return 0L;
        int m = (l + r) >>> 1;
        long inv = sortCount(a, tmp, l, m) + sortCount(a, tmp, m, r);
        int i = l, j = m, k = l;
        while (i < m && j < r) {
            if (a[i] <= a[j]) tmp[k++] = a[i++];
            else { tmp[k++] = a[j++]; inv += (m - i); }
        }
        while (i < m) tmp[k++] = a[i++];
        while (j < r) tmp[k++] = a[j++];
        System.arraycopy(tmp, l, a, l, r - l);
        return inv;
    }
    @Override public long countInversions(int[] a) {
        return sortCount(a, new int[a.length], 0, a.length);
    }
}
