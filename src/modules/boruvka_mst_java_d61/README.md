# Boruvka Minimum Spanning Forest Builder (`boruvka_mst_java_d61`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Builds a minimum spanning forest by repeatedly selecting the cheapest outgoing edge of every component and merging components through a union-find structure.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(E log V) component-minimum edge merging` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Every selected edge joins two distinct components and the total weight matches Kruskal on the same graph.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.boruvka_mst_java_d61.UnitTests
```

---
© 2026 Igor Kan
