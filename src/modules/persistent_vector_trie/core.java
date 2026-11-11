# Core computational routine for Persistent 32-Way Branching Vector Trie Collection
# Module: persistent_vector_trie

def compute_persistent_vector_trie(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
