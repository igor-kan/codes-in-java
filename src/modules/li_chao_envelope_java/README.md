# Dynamic Li Chao Segment Tree for Lower-Envelope Line Queries (`li_chao_envelope_java`)

> Category: **Convex Hull Optimization** | Language: **Java 21**

## Overview

Maintains the lower envelope of affine lines y = m*x + b over a discrete integer domain [0, X) by swapping dominant lines at segment midpoints.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(log X) line insertion and point minimum query` |
| **Space Complexity** | `O(X)` |

## Mathematical & Safety Invariants

- Point query returns exact min_i (m_i * x + b_i) across all inserted lines.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.li_chao_envelope_java.UnitTests
```

---
© 2026 Igor Kan
