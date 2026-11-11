# Boundary validation and exceptional input guarding for Disruptor Wait-Free MPSC Ring Buffer Event Queue
# Module: disruptor_wait_free_mpsc

def sanitize_disruptor_wait_free_mpsc_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
