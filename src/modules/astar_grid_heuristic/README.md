# A* 2D Grid Pathfinder with Admissible Manhattan Heuristic (`astar_grid_heuristic`)

> Category: **Search & Pathfinding** | Language: **Java 21**

## Overview

Searches minimum-cost orthogonal grid paths using consistent Manhattan L1 heuristics (f = g + h) with monotonic closed-set pruning and path reconstruction.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(E log V) bounded by obstacle-free Manhattan exploration` |
| **Space Complexity** | `O(R * C)` |

## Mathematical & Safety Invariants

- Every cell along the returned path lies inside bounds, is passable, and steps by Manhattan distance 1.
- Because Manhattan distance is admissible and consistent on 4-neighbor grids, A* returns exact shortest path cost matching BFS.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.astar_grid_heuristic.UnitTests
```

---
© 2026 Igor Kan
