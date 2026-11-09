# Deterministic unit tests for High-Throughput Disruptor Pattern Ring Queue
# Module: disruptor_ring_consumer

def test_disruptor_ring_consumer_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
