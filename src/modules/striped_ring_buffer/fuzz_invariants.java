# Fuzzing and invariant test target for Disruptor-Style Wait-Free Striped Circular Buffer
# Module: striped_ring_buffer
# Invariant: Output must remain finite for all finite inputs bounded in [-1e6, 1e6]
# Invariant: f(0) == 0 strictly preserved
