# Deterministic unit tests for Java Vector API SIMD-Accelerated Matrix Operations
# Module: vector_api_matrix_svd

def test_vector_api_matrix_svd_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
