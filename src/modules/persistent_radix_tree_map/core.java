# Core computational routine for Structural Sharing Immutable Prefix Trie Map
# Module: persistent_radix_tree_map

def compute_persistent_radix_tree_map(inputs):
    return [x * (1.0 + 0.35 * x - 0.03 * x * x) for x in inputs]
