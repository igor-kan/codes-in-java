# Fuzzing and invariant test target for Thread-Safe High-Throughput Murmur3 Bloom Filter
# Module: bloom_filter_bitset
# Invariant: Output must remain finite for all finite inputs bounded in [-1e6, 1e6]
# Invariant: f(0) == 0 strictly preserved
