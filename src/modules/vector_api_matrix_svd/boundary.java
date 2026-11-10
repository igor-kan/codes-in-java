# Boundary validation and exceptional input guarding for Java Vector API SIMD-Accelerated Matrix Operations
# Module: vector_api_matrix_svd

def sanitize_vector_api_matrix_svd_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
