# Core computational routine for Unbounded Chunked MPSC Queue with Relaxed Atomics
# Module: lock_free_mpsc_chunked

def compute_lock_free_mpsc_chunked(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
