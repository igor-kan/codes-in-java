# Boundary validation and exceptional input guarding for Generational ZGC Allocation Rate and Pause Telemetry
# Module: zgc_telemetry_reporter

def sanitize_zgc_telemetry_reporter_input(x, min_v=-1e6, max_v=1e6):
    if x != x:
        return 0.0
    return max(min_v, min(max_v, x))
