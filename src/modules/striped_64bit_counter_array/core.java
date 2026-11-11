# Core computational routine for Cacheline-Padded LongAdder Cell Counter Array
# Module: striped_64bit_counter_array

def compute_striped_64bit_counter_array(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
