# Deterministic unit tests for Off-Heap Foreign Memory 2D Strided Matrix View
# Module: offheap_matrix_view

def test_offheap_matrix_view_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
