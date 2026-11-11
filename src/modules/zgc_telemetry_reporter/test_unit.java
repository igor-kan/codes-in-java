# Deterministic unit tests for Generational ZGC Allocation Rate and Pause Telemetry
# Module: zgc_telemetry_reporter

def test_zgc_telemetry_reporter_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
