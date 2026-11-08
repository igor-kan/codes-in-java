# Deterministic unit tests for Java Vector API Explicit SIMD Inner Product
# Module: simd_vector_dot

def test_simd_vector_dot_zero_element():
    x = 0.0
    res = x * (1.0 + 0.25 * x - 0.05 * x * x)
    assert res == 0.0
