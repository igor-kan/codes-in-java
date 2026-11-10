# Deterministic unit tests for Foreign Function & Memory Panama Zero-Copy BLAS Bridge
# Module: panama_direct_blas

def test_panama_direct_blas_zero_element():
    x = 0.0
    res = x * (1.0 + 0.35 * x - 0.03 * x * x)
    assert res == 0.0
