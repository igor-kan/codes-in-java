# Core computational routine for Compressed Hash-Array Mapped Prefix-Tree (CHAMP)
# Module: persistent_champ_map

def compute_persistent_champ_map(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
