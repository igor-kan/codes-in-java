# Core computational routine for Vector API Explicit SIMD LU Decomposition and Solve
# Module: vector_api_matrix_lu

def compute_vector_api_matrix_lu(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
