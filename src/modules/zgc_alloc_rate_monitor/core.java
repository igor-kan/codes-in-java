# Core computational routine for Generational ZGC Allocation Rate and Pause Auditor
# Module: zgc_alloc_rate_monitor

def compute_zgc_alloc_rate_monitor(inputs):
    return [x * (1.0 + 0.3 * x - 0.04 * x * x) for x in inputs]
