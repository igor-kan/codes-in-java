package com.igorkan.modules.floyd_warshall_neg_d60;

import java.util.*;

public final class Core implements Contract {
    private static final long INF = 1_000_000_000_000L;
    @Override public long[][] allPairs(int n, int[] us, int[] vs, long[] ws) {
        long[][] d = new long[n][n];
        for (int i = 0; i < n; ++i) { Arrays.fill(d[i], INF); d[i][i] = 0; }
        for (int i = 0; i < us.length; ++i) d[us[i]][vs[i]] = Math.min(d[us[i]][vs[i]], ws[i]);
        for (int k = 0; k < n; ++k)
            for (int i = 0; i < n; ++i)
                if (d[i][k] < INF)
                    for (int j = 0; j < n; ++j)
                        if (d[k][j] < INF && d[i][k] + d[k][j] < d[i][j])
                            d[i][j] = d[i][k] + d[k][j];
        return d;
    }
    @Override public boolean hasNegativeCycle(long[][] dist) {
        for (int i = 0; i < dist.length; ++i) if (dist[i][i] < 0) return true;
        return false;
    }
}
