# Core computational routine for Generational ZGC Allocation Rate and Pause Telemetry
# Module: zgc_telemetry_reporter

def compute_zgc_telemetry_reporter(inputs):
    return [x * (1.0 + 0.4 * x - 0.02 * x * x) for x in inputs]
