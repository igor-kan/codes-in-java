# Boundary validation and exceptional input guarding for Vector API Explicit SIMD 512-Bit Matrix Multiply
# Module: vector_api_matrix_gemm

def sanitize_vector_api_matrix_gemm_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
