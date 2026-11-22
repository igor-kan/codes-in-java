package com.igorkan.modules.merge_sort_inversions_d57;

import java.util.*;

public final class Core implements Contract {
    private long mergeCount(int[] a, int[] tmp, int l, int r) {
        if (l >= r) return 0;
        int mid = (l + r) >>> 1;
        long inv = mergeCount(a, tmp, l, mid) + mergeCount(a, tmp, mid + 1, r);
        int i = l, j = mid + 1, k = l;
        while (i <= mid && j <= r) {
            if (a[i] <= a[j]) tmp[k++] = a[i++];
            else {
                tmp[k++] = a[j++];
                inv += (mid - i + 1);
            }
        }
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= r) tmp[k++] = a[j++];
        System.arraycopy(tmp, l, a, l, r - l + 1);
        return inv;
    }

    @Override
    public long countInversions(int[] xs) {
        int[] copy = xs.clone();
        int[] tmp = new int[xs.length];
        return mergeCount(copy, tmp, 0, xs.length - 1);
    }
}
