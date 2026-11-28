package com.igorkan.modules.gale_shapley_stable_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        int[][] pa = {{0, 1, 2, 3}, {1, 0, 2, 3}, {2, 1, 0, 3}, {0, 2, 1, 3}};
        int[][] pb = {{3, 1, 2, 0}, {1, 3, 0, 2}, {2, 0, 3, 1}, {0, 1, 2, 3}};
        int[] m = c.match(pa, pb);
        int[] matchB = new int[4];
        Arrays.fill(matchB, -1);
        for (int a = 0; a < 4; ++a) {
            int b = m[a];
            if (b < 0 || b >= 4 || matchB[b] != -1) throw new AssertionError("not a perfect matching");
            matchB[b] = a;
        }
        int[][] rankB = new int[4][4];
        for (int b = 0; b < 4; ++b) {
            for (int r = 0; r < pb[b].length; ++r) {
                rankB[b][pb[b][r]] = r;
            }
        }
        for (int a = 0; a < 4; ++a) {
            for (int b : pa[a]) {
                if (b == m[a]) break;
                if (rankB[b][a] < rankB[b][matchB[b]]) throw new AssertionError("blocking pair");
            }
        }
    }
}
