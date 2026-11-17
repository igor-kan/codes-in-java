package com.igorkan.modules.bloom_counting_java;

public final class Core implements Contract {
    private final int[] counters;
    private final int hashes;
    private int liveOps = 0;

    public Core(int buckets, int hashes) {
        Validation.validateDims(buckets, hashes);
        this.counters = new int[buckets];
        this.hashes = hashes;
    }

    @Override
    public void add(long key) {
        long h1 = FastPath.mix64(key);
        long h2 = FastPath.mix64(key ^ 0x9E3779B97F4A7C15L);
        int m = counters.length;
        for (int i = 0; i < hashes; i++) {
            int slot = Math.floorMod(h1 + (long) i * h2, m);
            if (counters[slot] < 65535) counters[slot]++;
        }
        liveOps++;
    }

    @Override
    public boolean mayContain(long key) {
        long h1 = FastPath.mix64(key);
        long h2 = FastPath.mix64(key ^ 0x9E3779B97F4A7C15L);
        int m = counters.length;
        for (int i = 0; i < hashes; i++) {
            int slot = Math.floorMod(h1 + (long) i * h2, m);
            if (counters[slot] == 0) return false;
        }
        return true;
    }

    @Override
    public boolean remove(long key) {
        if (!mayContain(key)) return false;
        long h1 = FastPath.mix64(key);
        long h2 = FastPath.mix64(key ^ 0x9E3779B97F4A7C15L);
        int m = counters.length;
        for (int i = 0; i < hashes; i++) {
            int slot = Math.floorMod(h1 + (long) i * h2, m);
            if (counters[slot] > 0) counters[slot]--;
        }
        liveOps--;
        return true;
    }

    public int estimateCount(long key) {
        long h1 = FastPath.mix64(key);
        long h2 = FastPath.mix64(key ^ 0x9E3779B97F4A7C15L);
        int m = counters.length;
        int minC = Integer.MAX_VALUE;
        for (int i = 0; i < hashes; i++) {
            int slot = Math.floorMod(h1 + (long) i * h2, m);
            minC = Math.min(minC, counters[slot]);
        }
        return minC;
    }

    public Types.FilterStats stats() { return new Types.FilterStats(counters.length, hashes, liveOps); }
}
