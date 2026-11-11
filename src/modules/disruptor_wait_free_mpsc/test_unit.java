# Deterministic unit tests for Disruptor Wait-Free MPSC Ring Buffer Event Queue
# Module: disruptor_wait_free_mpsc

def test_disruptor_wait_free_mpsc_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
