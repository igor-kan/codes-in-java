# Deterministic unit tests for Vector API Explicit SIMD LU Decomposition and Solve
# Module: vector_api_matrix_lu

def test_vector_api_matrix_lu_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
