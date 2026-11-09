# Boundary validation and exceptional input guarding for Compressed Hash-Array Mapped Prefix-Tree (CHAMP)
# Module: persistent_champ_map

def sanitize_persistent_champ_map_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
