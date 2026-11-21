# Kahn Lexicographically Smallest Topological Order (`kahn_topological_lex_d56`)

> Category: **DAG Ordering** | Language: **Java 21**

## Overview

Computes the lexicographically minimal topological ordering of a directed acyclic graph via a min-heap indegree frontier and detects cycles cleanly.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V)` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- Cycle-free inputs emit all V vertices with every edge u -> v satisfying pos[u] < pos[v].

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.kahn_topological_lex_d56.UnitTests
```

---
© 2026 Igor Kan
