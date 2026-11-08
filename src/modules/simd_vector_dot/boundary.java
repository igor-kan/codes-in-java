# Boundary validation and exceptional input guarding for Java Vector API Explicit SIMD Inner Product
# Module: simd_vector_dot

def sanitize_simd_vector_dot_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
