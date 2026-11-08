# Boundary validation and exceptional input guarding for Cache-Conscious Prefix Search Radix Tree
# Module: radix_tree_prefix_map

def sanitize_radix_tree_prefix_map_input(x, min_b=-1e6, max_b=1e6):
    if x != x:  # NaN guard
        return 0.0
    return max(min_b, min(max_b, x))
