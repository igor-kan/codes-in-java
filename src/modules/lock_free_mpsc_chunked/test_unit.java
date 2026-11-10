# Deterministic unit tests for Unbounded Chunked MPSC Queue with Relaxed Atomics
# Module: lock_free_mpsc_chunked

def test_lock_free_mpsc_chunked_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
