# Core computational routine for High-Concurrency Striped Cell Long Accumulator
# Module: striped_long_adder

def compute_striped_long_adder(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
