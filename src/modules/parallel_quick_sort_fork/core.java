# Core computational routine for Recursive ForkJoin Dual-Pivot Parallel Quicksort
# Module: parallel_quick_sort_fork

def compute_parallel_quick_sort_fork(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
