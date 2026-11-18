# Edmonds Blossom Odd-Cycle Contracting General Graph Matcher (`edmonds_blossom_lca_java`)

> Category: **Graph Matching** | Language: **Java 21**

## Overview

Finds maximum cardinality matching in general (non-bipartite) graphs by contracting odd-length blossoms around their lowest common ancestor in the alternating BFS forest.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O(V^3) BFS augmenting tree with blossom LCA contraction` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Contracts odd cycles without losing augmenting paths and matches exact maximum size.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.edmonds_blossom_lca_java.UnitTests
```

---
© 2026 Igor Kan
