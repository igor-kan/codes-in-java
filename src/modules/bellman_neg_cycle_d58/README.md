# Directed Edge-Relaxation Negative Cycle Detector (`bellman_neg_cycle_d58`)

> Category: **Graph Safety** | Language: **Java 21**

## Overview

Checks whether an arbitrary weighted directed graph contains any reachable negative-weight cycle from vertex 0 cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V * E)` |
| **Space Complexity** | `O(V)` |

## Mathematical & Safety Invariants

- Directed graphs with strictly non-negative weights never trigger cycle alarm.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.bellman_neg_cycle_d58.UnitTests
```

---
© 2026 Igor Kan
