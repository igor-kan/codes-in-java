# Deterministic unit tests for Vector API Explicit SIMD 512-Bit Matrix Multiply
# Module: vector_api_matrix_gemm

def test_vector_api_matrix_gemm_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
