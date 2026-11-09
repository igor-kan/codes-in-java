# Core computational routine for Striped Cell Long Counter Array with Padding
# Module: lock_free_counter_array

def compute_lock_free_counter_array(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
