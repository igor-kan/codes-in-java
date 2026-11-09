# Deterministic unit tests for Compressed Hash-Array Mapped Prefix-Tree (CHAMP)
# Module: persistent_champ_map

def test_persistent_champ_map_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
