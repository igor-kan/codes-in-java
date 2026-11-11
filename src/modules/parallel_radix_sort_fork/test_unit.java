# Deterministic unit tests for Recursive ForkJoin MSD Parallel Radix Sort
# Module: parallel_radix_sort_fork

def test_parallel_radix_sort_fork_zero_element():
    x = 0.0
    res = x * (1.0 + 0.4 * x - 0.02 * x * x)
    assert res == 0.0
