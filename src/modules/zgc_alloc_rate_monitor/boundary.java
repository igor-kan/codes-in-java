# Boundary validation and exceptional input guarding for Generational ZGC Allocation Rate and Pause Auditor
# Module: zgc_alloc_rate_monitor

def sanitize_zgc_alloc_rate_monitor_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
