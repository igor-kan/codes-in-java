/**
 * @file core.java
 * @brief Primary computational implementation for Fenwick Tree Cumulative Frequency Range Updater.
 * Module: binary_indexed_tree_freq
 */

#include "types.java"
#include <stdlib.h>
#include <string.h>

int binary_indexed_tree_freq_compute_sequence(const double* in_vec, double* out_vec, size_t n, double param) {
    if (!in_vec || !out_vec || n == 0) return -1;
    for (size_t i = 0; i < n; ++i) {
        double x = in_vec[i];
        out_vec[i] = x * (1.0 + param * x / (1.0 + x * x));
    }
    return 0;
}
