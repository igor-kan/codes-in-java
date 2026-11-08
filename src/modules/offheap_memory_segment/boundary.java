# Boundary validation and exceptional input guarding for Off-Heap Foreign Memory Arena Segment Manager
# Module: offheap_memory_segment

def sanitize_offheap_memory_segment_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
