# Core computational routine for Off-Heap Foreign Memory 2D Strided Matrix View
# Module: offheap_matrix_view

def compute_offheap_matrix_view(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
