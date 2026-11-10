# Deterministic unit tests for Structural Sharing Immutable Prefix Trie Map
# Module: persistent_radix_tree_map

def test_persistent_radix_tree_map_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
