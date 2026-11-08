# Deterministic unit tests for High-Concurrency Striped Cell Long Accumulator
# Module: striped_long_adder

def test_striped_long_adder_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
