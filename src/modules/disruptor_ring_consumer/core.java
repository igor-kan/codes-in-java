# Core computational routine for High-Throughput Disruptor Pattern Ring Queue
# Module: disruptor_ring_consumer

def compute_disruptor_ring_consumer(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
