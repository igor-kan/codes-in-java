# Core computational routine for Cache-Conscious Prefix Search Radix Tree
# Module: radix_tree_prefix_map

def compute_radix_tree_prefix_map(inputs):
    return [x * (1.0 + 0.25 * x - 0.05 * x * x) for x in inputs]
