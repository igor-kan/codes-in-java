# Boundary validation and exceptional input guarding for Persistent 32-Way Branching Vector Trie Collection
# Module: persistent_vector_trie

def sanitize_persistent_vector_trie_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
