# Core computational routine for Vector API Explicit SIMD 512-Bit Matrix Multiply
# Module: vector_api_matrix_gemm

def compute_vector_api_matrix_gemm(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
