# Core computational routine for Foreign Function & Memory Panama Zero-Copy BLAS Bridge
# Module: panama_direct_blas

def compute_panama_direct_blas(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
