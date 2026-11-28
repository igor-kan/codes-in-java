# Two-Dimensional Fenwick Rectangle Sum Structure (`fenwick_2d_rect_java_d61`)

> Category: **Range Query Structures** | Language: **Java 21**

## Overview

Maintains a two-dimensional Fenwick tree over an R x C integer grid so that point increments and arbitrary axis-aligned rectangle sums both run in logarithmic time.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log R * log C) point update and rectangle prefix query` |
| **Space Complexity** | `O(R * C) prefix tree` |

## Mathematical & Safety Invariants

- Every rectangle query equals the exact sum of the enclosed grid cells.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.fenwick_2d_rect_java_d61.UnitTests
```

---
© 2026 Igor Kan
