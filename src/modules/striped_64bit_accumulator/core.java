# Core computational routine for Cacheline-Padded LongAccumulator with Contention Cells
# Module: striped_64bit_accumulator

def compute_striped_64bit_accumulator(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
