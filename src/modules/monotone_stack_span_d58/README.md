# Monotonic Decreasing Stack Next-Greater Span Solver (`monotone_stack_span_d58`)

> Category: **Stack Algorithms** | Language: **Java 21**

## Overview

Computes stock/telemetry backward span counts using an ascending index monotonic stack in strict O(N) total pushes/pops.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N) amortized` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Every emitted span satisfies 1 <= span[i] <= i + 1 cleanly.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.monotone_stack_span_d58.UnitTests
```

---
© 2026 Igor Kan
