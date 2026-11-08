# Core computational routine for Wait-Free Multi-Producer Single-Consumer Queue
# Module: wait_free_mpsc_queue

def compute_wait_free_mpsc_queue(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
