# Boundary validation and exceptional input guarding for Off-Heap Foreign Memory 2D Strided Matrix View
# Module: offheap_matrix_view

def sanitize_offheap_matrix_view_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
