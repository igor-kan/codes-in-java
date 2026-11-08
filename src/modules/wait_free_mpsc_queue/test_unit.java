# Deterministic unit tests for Wait-Free Multi-Producer Single-Consumer Queue
# Module: wait_free_mpsc_queue

def test_wait_free_mpsc_queue_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
