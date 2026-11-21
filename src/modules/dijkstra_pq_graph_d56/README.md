# Java PriorityQueue Shortest Path Solver (`dijkstra_pq_graph_d56`)

> Category: **Graph Shortest Paths** | Language: **Java 21**

## Overview

Computes exact shortest paths over weighted adjacency arrays using a min-ordered PriorityQueue with stale-entry filtering.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V)` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Non-negative weights satisfy triangle relaxation dist[v] <= dist[u] + w.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.dijkstra_pq_graph_d56.UnitTests
```

---
© 2026 Igor Kan
