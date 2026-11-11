# Core computational routine for Disruptor Wait-Free MPSC Ring Buffer Event Queue
# Module: disruptor_wait_free_mpsc

def compute_disruptor_wait_free_mpsc(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
