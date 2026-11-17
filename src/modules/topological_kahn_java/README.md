# Lexicographical Kahn DAG Topological Sort & Longest Path DP (`topological_kahn_java`)

> Category: **Graph Algorithms** | Language: **Java 21**

## Overview

Computes the lexicographically smallest topological ordering of a directed acyclic graph using a min-heap over zero-indegree nodes while simultaneously evaluating longest critical path depth.

## Complexity Guarantees

| Metric | Asymptotic Bound |
| :--- | :--- |
| **Time Complexity** | `O((V + E) log V) min-heap topological ordering` |
| **Space Complexity** | `O(V + E)` |

## Mathematical & Safety Invariants

- For every edge u -> v, pos[u] < pos[v] in the returned topological order.
- Graphs containing a cycle throw an explicit INVARIANT/cycle exception cleanly.

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
javac -d /tmp/jbuild *.java && java -ea -cp /tmp/jbuild com.igorkan.modules.topological_kahn_java.UnitTests
```

---
© 2026 Igor Kan
