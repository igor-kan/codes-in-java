# Deterministic unit tests for Foreign Function & Memory Off-Heap Ring Buffer
# Module: panama_arena_ring_queue

def test_panama_arena_ring_queue_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
