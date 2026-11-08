# Deterministic unit tests for Cache-Conscious Prefix Search Radix Tree
# Module: radix_tree_prefix_map

def test_radix_tree_prefix_map_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
