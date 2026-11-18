# Hopcroft-Karp O(E sqrt(V)) Maximum Bipartite Matching in Java 21 (`hopcroft_karp_matching_java`)

> Category: **Graph Matching** | Language: **Java 21**

## Overview

Computes maximum cardinality bipartite matching by finding all shortest vertex-disjoint augmenting paths per BFS distance phase.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(E * sqrt(V)) multi-path layered BFS + DFS augmentation` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Matched left and right vertices form a valid bijection of maximum cardinality.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.hopcroft_karp_matching_java.UnitTests
```

---
© 2026 Igor Kan
