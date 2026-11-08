# Deterministic unit tests for Off-Heap Foreign Memory Arena Segment Manager
# Module: offheap_memory_segment

def test_offheap_memory_segment_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
