# Floyd-Warshall All-Pairs Shortest Paths & Negative Cycle Detector (`floyd_warshall_neg_d60`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Computes all-pairs shortest distances over directed weighted graphs and detects negative-weight cycles via negative diagonal entries.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V^3) triple nested relaxation` |
| **Space Complexity** | `O(V^2)` |

## Mathematical & Safety Invariants

- Triangle inequality holds for every reachable pair whenever no negative cycle exists.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.floyd_warshall_neg_d60.UnitTests
```

---
© 2026 Igor Kan
