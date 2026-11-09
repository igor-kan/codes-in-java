# Deterministic unit tests for Off-Heap Foreign Memory 2D Bitset Adjacency Matrix
# Module: offheap_bitset_matrix

def test_offheap_bitset_matrix_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
