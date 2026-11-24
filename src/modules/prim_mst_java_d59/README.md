# PriorityQueue Prim Undirected Minimum Spanning Tree (`prim_mst_java_d59`)

> Category: **Spanning Trees** | Language: **Java 21**

## Overview

Builds exact minimum spanning forest weight via lazy Prim PriorityQueue edge cuts cleanly on undirected weighted graphs.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V)` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Equilateral triangle MST weight strictly equals 2 * edge_weight.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.prim_mst_java_d59.UnitTests
```

---
© 2026 Igor Kan
