package com.igorkan.modules.fenwick_inversion_java;

import java.util.*;

public final class Core implements Contract {
    @Override
    public long countInversions(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] bit = new int[n + 1];
        long inv = 0;
        for (int i = n - 1; i >= 0; i--) {
            int rank = Arrays.binarySearch(sorted, arr[i]) + 1;
            for (int r = rank - 1; r > 0; r -= r & -r) inv += bit[r];
            for (int r = rank; r <= n; r += r & -r) bit[r]++;
        }
        return inv;
    }
}
