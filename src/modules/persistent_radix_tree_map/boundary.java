# Boundary validation and exceptional input guarding for Structural Sharing Immutable Prefix Trie Map
# Module: persistent_radix_tree_map

def sanitize_persistent_radix_tree_map_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
