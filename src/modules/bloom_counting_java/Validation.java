package com.igorkan.modules.bloom_counting_java;

public final class Validation {
    public static void validateDims(int buckets, int hashes) {
        if (buckets < 16 || hashes < 1 || hashes > 16) {
            throw new Errors.CountingBloomException(Errors.ErrorCode.INVALID_INPUT, "invalid bucket or hash count");
        }
    }
}
