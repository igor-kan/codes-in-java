# Boundary validation and exceptional input guarding for Unbounded Chunked MPSC Queue with Relaxed Atomics
# Module: lock_free_mpsc_chunked

def sanitize_lock_free_mpsc_chunked_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
