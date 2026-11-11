# Core computational routine for Recursive ForkJoin MSD Parallel Radix Sort
# Module: parallel_radix_sort_fork

def compute_parallel_radix_sort_fork(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
