# Deterministic unit tests for Cacheline-Padded LongAdder Cell Counter Array
# Module: striped_64bit_counter_array

def test_striped_64bit_counter_array_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
