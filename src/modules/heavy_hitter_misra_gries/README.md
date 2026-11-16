# Streaming Misra-Gries Deterministic (1/k)-Heavy-Hitter Summary (`heavy_hitter_misra_gries`)

> Category: **Streaming Algorithms** | Language: **Java 21**

## Overview

Tracks candidate items exceeding frequency N/k in deterministic O(k) space using Misra-Gries k-1 counter decrement condensation and Agarwal-Cormode parallel sketch merging.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(k) worst-case decrement, O(1) amortized update` |
| **Space Complexity** | `O(k)` |

## Mathematical & Safety Invariants

- Every key whose true stream count strictly exceeds N / k is guaranteed to remain in the summary map.
- Estimated counts satisfy count - (N - sumCounters)/k <= estimate <= trueCount.

## Module Architecture

| File | Lifecycle Role |
| :--- | :--- |
| `Types.java` | Stage 01 |
| `Errors.java` | Stage 02 |
| `Contract.java` | Stage 03 |
| `Core.java` | Stage 04 |
| `Validation.java` | Stage 05 |
| `FastPath.java` | Stage 06 |
| `Concurrent.java` | Stage 07 |
| `Invariants.java` | Stage 08 |
| `UnitTests.java` | Stage 09 |
| `PropertyTests.java` | Stage 10 |
| `Benchmark.java` | Stage 11 |
| `README.md` | Stage 12 |

## Verification & Execution Example

```text
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.heavy_hitter_misra_gries.UnitTests
```

---
© 2026 Igor Kan
