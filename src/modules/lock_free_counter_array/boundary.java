# Boundary validation and exceptional input guarding for Striped Cell Long Counter Array with Padding
# Module: lock_free_counter_array

def sanitize_lock_free_counter_array_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
