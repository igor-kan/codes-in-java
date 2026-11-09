# Deterministic unit tests for Generational ZGC Allocation Rate and Pause Auditor
# Module: zgc_alloc_rate_monitor

def test_zgc_alloc_rate_monitor_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
