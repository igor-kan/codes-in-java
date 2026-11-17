package com.igorkan.modules.bloom_counting_java;

public final class Types {
    public record FilterStats(int buckets, int hashes, int liveAdds) {}
}
