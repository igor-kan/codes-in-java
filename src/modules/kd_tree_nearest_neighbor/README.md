# Branch-and-Bound K-D Tree Exact Nearest Neighbor Index (`kd_tree_nearest_neighbor`)

> Category: **Spatial Data Structures** | Language: **Java 21**

## Overview

Partitions multidimensional points by median axis splits and prunes far subtrees whenever splitting-plane perpendicular distance squared exceeds current best squared distance.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(N log N) balanced median build, O(log N) typical query` |
| **Space Complexity** | `O(N)` |

## Mathematical & Safety Invariants

- Exact nearest neighbor distance squared returned matches linear O(N) exhaustive scan on every query.
- Balanced tree height does not exceed ceil(log2(N + 1)).

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.kd_tree_nearest_neighbor.UnitTests
```

---
© 2026 Igor Kan
