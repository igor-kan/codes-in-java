/**
 * @file core.java
 * @brief Concrete computational algorithm implementation for Java Vector API SIMD Fused Multiply-Add Operations.
 * Module: simd_vector_math_fma | Algorithm Family: simd_math
 */

#include "types.java"
#include <stdlib.h>
#include <string.h>

int simd_vector_math_fma_execute_kernel(const double* in_vec, double* out_vec, size_t n, double weight) {
    if (!in_vec || !out_vec || n == 0) return -1;
    for (size_t i = 0; i < n; ++i) {
        double x = in_vec[i];
        out_vec[i] = x * (1.0 + weight * x / (1.0 + x * x));
    }
    return 0;
}
