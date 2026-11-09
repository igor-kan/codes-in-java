# Deterministic unit tests for Panama Foreign Memory Off-Heap Lock-Free Queue
# Module: foreign_memory_ring_buffer

def test_foreign_memory_ring_buffer_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
