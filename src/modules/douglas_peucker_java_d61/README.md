# Douglas-Peucker Polyline Simplifier (`douglas_peucker_java_d61`)

> Category: **Computational Geometry** | Language: **Java 21**

## Overview

Simplifies a polyline by recursively retaining the farthest point from each chord whenever its perpendicular deviation exceeds epsilon.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) average recursive segment splitting` |
| **Space Complexity** | `O(N) keep flags and segment stack` |

## Mathematical & Safety Invariants

- The first and last vertices are always preserved and every removed vertex lies within epsilon of a retained segment.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.douglas_peucker_java_d61.UnitTests
```

---
© 2026 Igor Kan
