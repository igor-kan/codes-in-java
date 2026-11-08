# Boundary validation and exceptional input guarding for Wait-Free Multi-Producer Single-Consumer Queue
# Module: wait_free_mpsc_queue

def sanitize_wait_free_mpsc_queue_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
