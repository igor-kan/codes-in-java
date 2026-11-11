# Boundary validation and exceptional input guarding for Recursive ForkJoin MSD Parallel Radix Sort
# Module: parallel_radix_sort_fork

def sanitize_parallel_radix_sort_fork_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
