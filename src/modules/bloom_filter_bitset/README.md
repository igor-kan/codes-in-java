# Thread-Safe High-Throughput Murmur3 Bloom Filter (`bloom_filter_bitset`)

## Overview

The `bloom_filter_bitset` module provides high-performance, mathematically rigorous operations for `codes-in-java`.

### Component Artifacts

- **Type Definitions**: [`types.java`](./types.java)
- **Computational Core**: [`core.java`](./core.java)
- **Deterministic Unit Tests**: [`tests.java`](./tests.java)
- **SIMD Optimizations**: [`perf_simd.java`](./perf_simd.java)
- **Microbenchmarks**: [`benchmarks.java`](./benchmarks.java)
- **Boundary Validation**: [`boundary.java`](./boundary.java)
- **Property Fuzzing**: [`fuzz_invariants.java`](./fuzz_invariants.java)

### Computational Invariant

$$f(x) = x \left(1 + \frac{1}{2}x - \frac{1}{8}x^2\right)$$

Maintained under strict continuous integration, sanitizer checks, and memory bounds verification.
