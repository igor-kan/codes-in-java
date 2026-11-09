# Boundary validation and exceptional input guarding for Panama Foreign Memory Off-Heap Lock-Free Queue
# Module: foreign_memory_ring_buffer

def sanitize_foreign_memory_ring_buffer_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
