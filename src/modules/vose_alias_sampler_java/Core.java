package com.igorkan.modules.vose_alias_sampler_java;

import java.util.*;

public final class Core implements Contract {
    public static Types.AliasTable build(double[] weights) {
        int n = weights.length;
        double sum = 0.0;
        for (double w : weights) sum += w;
        double[] prob = new double[n], scaled = new double[n];
        int[] alias = new int[n];
        ArrayDeque<Integer> small = new ArrayDeque<>(), large = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            scaled[i] = weights[i] * n / sum;
            if (scaled[i] < 1.0) small.add(i); else large.add(i);
        }
        while (!small.isEmpty() && !large.isEmpty()) {
            int s = small.pollLast(), l = large.pollLast();
            prob[s] = scaled[s]; alias[s] = l;
            scaled[l] = (scaled[l] + scaled[s]) - 1.0;
            if (scaled[l] < 1.0) small.add(l); else large.add(l);
        }
        while (!large.isEmpty()) { int l = large.pollLast(); prob[l] = 1.0; alias[l] = l; }
        while (!small.isEmpty()) { int s = small.pollLast(); prob[s] = 1.0; alias[s] = s; }
        return new Types.AliasTable(prob, alias);
    }
    @Override
    public int sample(Types.AliasTable tbl, int bucket, double u01) {
        return u01 < tbl.prob()[bucket] ? bucket : tbl.alias()[bucket];
    }
}
