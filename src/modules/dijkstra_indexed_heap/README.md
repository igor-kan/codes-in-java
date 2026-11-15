# Indexed Binary Min-Heap Dijkstra Shortest Path Solver (`dijkstra_indexed_heap`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Implements Dijkstra's shortest-path solver backed by an indexed O(log V) binary min-heap supporting in-place decreaseKey via vertex-to-heap-index position tracking.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V) with zero duplicate heap entries` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Heap position array position[heap[i]] == i holds for all live entries.
- Final distances satisfy triangle/Bellman optimality dist[u] + w >= dist[v].

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.dijkstra_indexed_heap.UnitTests
```

---
© 2026 Igor Kan
