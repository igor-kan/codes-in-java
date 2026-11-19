# Stoer-Wagner Global Undirected Min-Cut Solver in Java 21 (`stoer_wagner_mincut_java`)

> Category: **Graph Cuts** | Language: **Java 21**

## Overview

Computes exact global minimum cut over undirected weighted graphs via Stoer-Wagner maximum-adjacency contraction phases.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V^3) maximum-adjacency phase contraction` |
| **Space Complexity** | `O(V^2)` |

## Mathematical & Safety Invariants

- Global minimum cut weight <= minimum weighted vertex degree.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.stoer_wagner_mincut_java.UnitTests
```

---
© 2026 Igor Kan
