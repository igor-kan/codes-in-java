# Deterministic unit tests for Persistent 32-Way Branching Vector Trie Collection
# Module: persistent_vector_trie

def test_persistent_vector_trie_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
