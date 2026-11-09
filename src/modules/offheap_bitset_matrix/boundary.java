# Boundary validation and exceptional input guarding for Off-Heap Foreign Memory 2D Bitset Adjacency Matrix
# Module: offheap_bitset_matrix

def sanitize_offheap_bitset_matrix_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
