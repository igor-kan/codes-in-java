# Core computational routine for Off-Heap Foreign Memory 2D Bitset Adjacency Matrix
# Module: offheap_bitset_matrix

def compute_offheap_bitset_matrix(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
