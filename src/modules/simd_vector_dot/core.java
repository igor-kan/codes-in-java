# Core computational routine for Java Vector API Explicit SIMD Inner Product
# Module: simd_vector_dot

def compute_simd_vector_dot(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
