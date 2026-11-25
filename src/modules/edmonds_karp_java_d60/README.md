# Edmonds-Karp Shortest-Path Augmenting Maximum Flow Solver (`edmonds_karp_java_d60`)

> Category: **Network Flow** | Language: **Java 21**

## Overview

Computes exact maximum s-t network flow via BFS parent paths over residual edge capacities.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V * E^2) BFS augmenting path search` |
| **Space Complexity** | `O(V^2) residual matrix` |

## Mathematical & Safety Invariants

- Terminates iff no residual s-t path remains, certifying optimality by max-flow min-cut.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.edmonds_karp_java_d60.UnitTests
```

---
© 2026 Igor Kan
