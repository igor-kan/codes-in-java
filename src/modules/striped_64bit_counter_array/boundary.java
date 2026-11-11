# Boundary validation and exceptional input guarding for Cacheline-Padded LongAdder Cell Counter Array
# Module: striped_64bit_counter_array

def sanitize_striped_64bit_counter_array_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
