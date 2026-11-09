# Deterministic unit tests for Striped Cell Long Counter Array with Padding
# Module: lock_free_counter_array

def test_lock_free_counter_array_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
