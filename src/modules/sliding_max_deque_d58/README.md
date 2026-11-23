# Java ArrayDeque Linear Sliding-Window Max Extractor (`sliding_max_deque_d58`)

> Category: **Streaming Extrema** | Language: **Java 21**

## Overview

Produces exact per-frame K-width sliding maxima in a single linear pass using ArrayDeque index eviction from both ends.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N)` |
| **Space Complexity** | `O(K)` |

## Mathematical & Safety Invariants

- Result array length strictly equals N - K + 1 matching max in each subarray.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.sliding_max_deque_d58.UnitTests
```

---
© 2026 Igor Kan
