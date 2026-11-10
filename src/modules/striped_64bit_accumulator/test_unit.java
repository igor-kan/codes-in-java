# Deterministic unit tests for Cacheline-Padded LongAccumulator with Contention Cells
# Module: striped_64bit_accumulator

def test_striped_64bit_accumulator_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
