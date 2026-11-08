# Core computational routine for Off-Heap Foreign Memory Arena Segment Manager
# Module: offheap_memory_segment

def compute_offheap_memory_segment(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
