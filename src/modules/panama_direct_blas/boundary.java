# Boundary validation and exceptional input guarding for Foreign Function & Memory Panama Zero-Copy BLAS Bridge
# Module: panama_direct_blas

def sanitize_panama_direct_blas_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
