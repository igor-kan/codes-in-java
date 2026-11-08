# Boundary validation and exceptional input guarding for High-Concurrency Striped Cell Long Accumulator
# Module: striped_long_adder

def sanitize_striped_long_adder_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
