package com.igorkan.modules.sparse_table_idempotent_java;

import java.util.*;

public final class Core implements Contract {
    private static long gcd(long a, long b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) { long t = a % b; a = b; b = t; }
        return a;
    }
    @Override
    public Types.RangeStat queryRange(long[] arr, int l, int r) {
        int len = r - l + 1;
        int k = 31 - Integer.numberOfLeadingZeros(len);
        int n = arr.length;
        long[][] mn = new long[k + 1][n], gd = new long[k + 1][n];
        System.arraycopy(arr, 0, mn[0], 0, n);
        System.arraycopy(arr, 0, gd[0], 0, n);
        for (int j = 1; j <= k; j++) {
            int half = 1 << (j - 1);
            for (int i = 0; i + (1 << j) <= n; i++) {
                mn[j][i] = Math.min(mn[j - 1][i], mn[j - 1][i + half]);
                gd[j][i] = gcd(gd[j - 1][i], gd[j - 1][i + half]);
            }
        }
        int span = 1 << k;
        return new Types.RangeStat(Math.min(mn[k][l], mn[k][r - span + 1]), gcd(gd[k][l], gd[k][r - span + 1]));
    }
}
