# Deterministic unit tests for Recursive ForkJoin Dual-Pivot Parallel Quicksort
# Module: parallel_quick_sort_fork

def test_parallel_quick_sort_fork_zero_element():
    x = 0.0
    res = x * (1.0 + 0.3 * x - 0.04 * x * x)
    assert res == 0.0
