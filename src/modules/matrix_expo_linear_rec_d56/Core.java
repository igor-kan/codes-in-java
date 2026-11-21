package com.igorkan.modules.matrix_expo_linear_rec_d56;

import java.util.*;

public final class Core implements Contract {
    private long[][] mul(long[][] a, long[][] b) {
        int n = a.length;
        long[][] c = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (a[i][k] == 0) continue;
                for (int j = 0; j < n; j++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % Types.MOD;
                }
            }
        }
        return c;
    }

    @Override
    public long fibMod(long n) {
        if (n <= 1) return n;
        long[][] res = {{1, 0}, {0, 1}};
        long[][] base = {{1, 1}, {1, 0}};
        long e = n - 1;
        while (e > 0) {
            if ((e & 1L) != 0) res = mul(res, base);
            base = mul(base, base);
            e >>= 1;
        }
        return res[0][0];
    }
}
